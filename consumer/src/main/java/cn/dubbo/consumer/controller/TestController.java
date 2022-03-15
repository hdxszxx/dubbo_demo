package cn.dubbo.consumer.controller;

import cn.dubbo.dubbo_demo.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxx
 * @version 1.0
 * @date 2022/3/15 12:13
 */
@RestController
public class TestController {

    @Reference()
    private TestService testService;

    @RequestMapping("/ins")
    public String ins(){
        testService.ins();
        return "ins";
    }

    @RequestMapping("/del")
    public String del(){
        testService.del();
        return "del";
    }

    @RequestMapping("/upd")
    public String upd(){
        testService.upd();
        return "upd";
    }

    @RequestMapping("/sel")
    public String sel(){
        testService.sel();
        return "sel";
    }
}
