package cn.maomao.service.Impl;

import cn.maomao.mapper.AirplaneMapper;
import cn.maomao.pojo.Airplane;
import cn.maomao.service.AirplaneService;
import cn.maomao.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {
    @Override
    public List<Airplane> show(int takeid, int landid) {
        return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeIdLandId(takeid, landid);
    }
}
