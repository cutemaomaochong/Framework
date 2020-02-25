package cn.maomao.mapper;

import cn.maomao.pojo.Airport;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/*
* 注解方式
* */
public interface AirportMapper {

    @Select("select * from airport where id in (select distinct takeid from airplane)")
    List<Airport> selTakePort();
    @Select("select * from airport where id in (select distinct landid from airplane)")
    List<Airport> selLandPort();
}
