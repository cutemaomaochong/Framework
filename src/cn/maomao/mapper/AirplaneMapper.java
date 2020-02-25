package cn.maomao.mapper;

import cn.maomao.pojo.Airplane;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
/*
* 接口绑定方式，配合AirplaneMapper.xml使用
* 使用到动态SQL
* */
public interface AirplaneMapper {
    //通过@Param("key")将参数转换为map类型，key所对应的的value值即为参数值
    List<Airplane> selByTakeIdLandId(@Param("takeid") int takeid,@Param("landid") int landid);
}
