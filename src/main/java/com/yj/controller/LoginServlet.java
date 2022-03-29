package com.yj.controller;

import com.yj.pojo.User;
import com.yj.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userService.selectByUsernameAndPassword(username, password);
        if (user != null){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！");
        }

        String method = request.getMethod();
        if (Objects.equals(method, "GET")){
            System.out.println("表单的提交方式为get");
        }else if (Objects.equals(method, "POST")){
            System.out.println("表单的提交方式为post");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
