package cn.maomao.service.impl;

import cn.maomao.mapper.MenuMapper;
import cn.maomao.pojo.Menu;
import cn.maomao.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> show() {
        return menuMapper.selByPid(0);
    }
}
