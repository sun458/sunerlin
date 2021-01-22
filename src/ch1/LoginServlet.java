package ch1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ch1.LoginServlet" , urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost");

        //设置request的编码集
        request.setCharacterEncoding("utf-8");
        //设置response的编码集
        response.setContentType("text/html;charset=utf-8");

        //获取请求参数
        //获取单个值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = "+username+", password = "+password);

        if(username!=null && !"".equals(username)){
            //跳转至成功页面

            //响应重定向：会产生新的请求，不会携带数据
            //response.sendRedirect("success");

            //请求转发：不会产生新的请求，沿用之前的请求，所以可以携带数据
            request.getRequestDispatcher("success").forward(request,response);

        }else{
            //跳转至失败页面
            response.sendRedirect("fail");
        }
        //获取多个值
        //String[] hobbies = request.getParameterValues("hobby");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
        this.doPost(request,response);
    }
}
