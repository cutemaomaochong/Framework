package cn.maomao.service;

import cn.maomao.pojo.Airport;

import java.util.List;

public interface AirportService {
    /*
    * 显示所有起飞机场
    * */
    List<Airport> showTakePort();

    /*
    * 显示所有降落机场
    * */
    List<Airport> showLandPort();
}
