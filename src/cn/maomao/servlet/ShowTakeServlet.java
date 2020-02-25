package cn.maomao.servlet;

import cn.maomao.service.AirportService;
import cn.maomao.service.Impl.AirPortServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowTakeServlet", urlPatterns = "/ShowTakeServlet")
public class ShowTakeServlet extends HttpServlet {
    private AirportService airPortService = new AirPortServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("takeport",airPortService.showTakePort());
        request.getRequestDispatcher("ShowLandServlet").forward(request,response);
    }
}
