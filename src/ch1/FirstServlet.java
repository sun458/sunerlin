package ch1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ch1.FirstServlet" , urlPatterns = "/first" , loadOnStartup = 2)
public class FirstServlet extends HttpServlet {

    public FirstServlet(){
        System.out.println("FirstServlet实例化");
    }

    @Override
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

        //获取多个值
        //String[] hobbies = request.getParameterValues("hobby");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet");
        this.doPost(request,response);
    }
}
