package ch4.controller;


import ch4.entity.User;
import ch4.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "/userLogin")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService service = new UserService();
        HttpSession session = request.getSession();

        String code = request.getParameter("code");

        if(code!=null && !code.equals("")){
            switch(code){
                case "login":
                    String name = request.getParameter("name");
                    String pwd = request.getParameter("pwd");
                    User user = service.login(name,pwd);

                    if(user!=null){
                        //登陆成功
                        session.setAttribute("user",user);
                        request.getRequestDispatcher("items/main.jsp").forward(request,response);
                    }else{
                        //登陆失败
                        request.setAttribute("msg","用户名与密码不匹配");
                        request.getRequestDispatcher("items/login.jsp").forward(request,response);
                    }
                    break;
                case "logout":
                    session.invalidate();
                    request.setAttribute("msg","当前用户已登出");
                    request.getRequestDispatcher("items/login.jsp").forward(request,response);
                    break;
                default:
                    System.out.println("无此操作项");
                    break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
