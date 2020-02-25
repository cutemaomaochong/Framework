package cn.maomao.servlet;

import cn.maomao.pojo.Airport;
import cn.maomao.service.AirportService;
import cn.maomao.service.Impl.AirPortServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowLandServlet", urlPatterns = "/ShowLandServlet")
public class ShowLandServlet extends HttpServlet {
    private AirportService airportService = new AirPortServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("landport",airportService.showLandPort());
        request.getRequestDispatcher("ShowAirplaneServlet").forward(request,response);
    }
}
