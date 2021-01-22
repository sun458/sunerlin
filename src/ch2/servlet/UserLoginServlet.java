package ch2.servlet;

import ch2.entity.User;
import ch2.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "UserLoginServlet", urlPatterns = "/user")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求中的编码集
        request.setCharacterEncoding("utf-8");

        //获得请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String timeLength = request.getParameter("timeLength");

        UserService service = new UserService();

        if (username != null && password != null && !"".equals(username) && !"".equals(password)) {
            User user = service.login(username, password);
            if (user != null) {
                //简化登录：通过cookie存储姓名和密码
                if (timeLength != null && !timeLength.equals("0")) {
                    int day = Integer.parseInt(timeLength);

                    //1.创建Cookie
                    //编码
                    Cookie usernameCookie = new Cookie("usernameCookie", URLEncoder.encode(username, "utf-8"));
                    Cookie passwordCookie = new Cookie("passwordCookie", password);

                    //2.设置有效时长，存储在浏览器所在的PC机上
                    usernameCookie.setMaxAge(day * 24 * 60 * 60);
                    passwordCookie.setMaxAge(day * 24 * 60 * 60);

                    //3.响应至客户端
                    response.addCookie(usernameCookie);
                    response.addCookie(passwordCookie);
                }
                //跳转至登录成功页面
                request.getRequestDispatcher("success.jsp").forward(request, response);

            } else {
                //提示用户账号或密码有误
                request.setAttribute("msg", "账号或密码有误!");
                request.getRequestDispatcher("userLogin.jsp").forward(request, response);
            }
        } else {
            //此处账号或密码为空
            request.setAttribute("msg", "账号或密码不能为空");
            request.getRequestDispatcher("userLogin.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
