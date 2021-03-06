package com.imooc.cake.servlet;

import com.imooc.cake.entity.Category;
import com.imooc.cake.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 分类Servlet
 */
public class CategoryServlet extends HttpServlet {
    private CategoryService categoryService;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("/category/list.do".equals(req.getServletPath())) {
            List<Category> categories = categoryService.getCategories();
            req.setAttribute("categories",categories);
            req.getRequestDispatcher("/WEB-INF/views/biz/category_list.jsp").forward(req,resp);
        } else if ("/category/addPrompt.do".equals(req.getServletPath())) {
            req.getRequestDispatcher("/WEB-INF/views/biz/add_category.jsp").forward(req,resp);
        } else if ("/category/add.do".equals(req.getServletPath())) {
            String name = req.getParameter("name");
            Category category = new Category();
            category.setName(name);
            categoryService.addCategory(category);
            req.getRequestDispatcher("/category/list.do").forward(req,resp);
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();
        categoryService = new CategoryService();
    }

    @Override
    public void destroy() {
        super.destroy();
        categoryService = null;
    }
}
