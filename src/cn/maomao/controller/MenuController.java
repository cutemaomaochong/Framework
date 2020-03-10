package cn.maomao.controller;

import cn.maomao.pojo.Menu;
import cn.maomao.service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MenuController {
    /*
    * springmvc容器调用spring容器中内容
    * */
    @Resource
    private MenuService menuServiceImpl;

    @RequestMapping("show")
    @ResponseBody
    public List<Menu> show(){
        return menuServiceImpl.show();
    }
}
