package cn.maomao.service;

import cn.maomao.pojo.Airplane;

import java.util.List;

public interface AirplaneService {
    List<Airplane> show(int takeid,int landid);
}
