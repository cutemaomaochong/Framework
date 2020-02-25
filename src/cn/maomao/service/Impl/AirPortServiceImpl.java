package cn.maomao.service.Impl;

import cn.maomao.mapper.AirportMapper;
import cn.maomao.pojo.Airport;
import cn.maomao.service.AirportService;
import cn.maomao.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirPortServiceImpl implements AirportService {
    @Override
    public List<Airport> showTakePort() {
        SqlSession session = MyBatisUtil.getSession();
        AirportMapper mapper = session.getMapper(AirportMapper.class);

        return mapper.selTakePort();
    }

    @Override
    public List<Airport> showLandPort() {
        SqlSession session = MyBatisUtil.getSession();
        AirportMapper mapper = session.getMapper(AirportMapper.class);

        return mapper.selLandPort();
    }
}
