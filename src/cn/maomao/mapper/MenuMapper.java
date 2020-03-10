package cn.maomao.mapper;

import cn.maomao.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> selByPid(int pid);
}
