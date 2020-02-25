package cn.maomao.servlet;

import cn.maomao.service.AirplaneService;
import cn.maomao.service.AirportService;
import cn.maomao.service.Impl.AirPortServiceImpl;
import cn.maomao.service.Impl.AirplaneServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAirplaneServlet", urlPatterns = "/ShowAirplaneServlet")
public class ShowAirplaneServlet extends HttpServlet {
    private AirplaneService airplaneService = new AirplaneServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        int takeid = 0;
        String takeIdStr = request.getParameter("takeid");
        if (takeIdStr!=null && !takeIdStr.equals("")){
            takeid = Integer.parseInt(takeIdStr);
        }

        int landid = 0;
        String landIdStr = request.getParameter("landid");
        if (landIdStr!=null && landIdStr.equals("")){
            landid = Integer.parseInt(landIdStr);
        }

        request.setAttribute("list",airplaneService.show(takeid,landid));
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
