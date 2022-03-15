package cn.dubbo.provider.service.impl;

import cn.dubbo.dubbo_demo.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zxx
 * @version 1.0
 * @date 2022/3/15 12:11
 */
@Service(interfaceClass = TestService.class)
public class TestServiceImpl implements TestService {
    @Override
    public void ins() {
        System.out.println("insert");
    }

    @Override
    public void del() {
        System.out.println("delete");
    }

    @Override
    public void upd() {
        System.out.println("update");
    }

    @Override
    public void sel() {
        System.out.println("select");
    }
}
