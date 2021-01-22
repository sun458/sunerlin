package ch4.controller;

import ch4.entity.Items;
import ch4.service.ItemsService;
import ch4.vo.PageVO;
import net.sf.json.JSONObject;
import netscape.javascript.JSObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ItemsServletServlet", urlPatterns = "/items")
//当前Servlet接收multiparty/form-data请求，将一个Servlet标识为支持文件上传
public class ItemsServletServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ItemsService service = new ItemsService();
        String code = request.getParameter("code");

        if(code!=null && !"".equals(code)){
            switch(code){
                case "viewAll":
                    //获取当前页码
                    String page = request.getParameter("pageNow");
                    int pageNow;
                    if(page==null){
                        pageNow = 1;
                    }else{
                        pageNow = Integer.parseInt(page);
                    }

                    //获取当前查询条件
                    String query = request.getParameter("query");
                    if(query==null){
                        query = ""; //默认没有条件，查询所有
                    }

                    PageVO<Items> pageVO = service.viewAll(query, pageNow);
                    request.setAttribute("vo",pageVO);
                    request.getRequestDispatcher("items/itemsList.jsp").forward(request,response);
                case "validate":
                    String name = request.getParameter("name");
                    boolean flag = service.validate(name);
                    String message = "";
                    if(flag){
                        message = "当前商品名称可以使用";
                    }else{
                        message = "当前商品名称已被占用";
                    }

                    //以json数据格式，将flag、messsage的值传递至页面
                    JSONObject obj = new JSONObject();
                    //将两个数据绑定到json数据上
                    obj.put("flag",Boolean.toString(flag));
                    obj.put("message",message);

                    //通过响应获得输出流
                    PrintWriter out = response.getWriter();
                    //将json数据以字符串的形式写到页面
                    out.println(obj.toString());
                    out.flush();
                    out.close();
                    break;
                case "add":
                    break;
                case "viewOne":
                    break;
                case "update":
                    break;
                case "delete":
                    break;
                default:
                    break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
