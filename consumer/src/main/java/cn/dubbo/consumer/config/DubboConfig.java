package cn.dubbo.consumer.config;

import org.apache.dubbo.config.ConsumerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author zxx
 * @version 1.0
 * @date 2022/3/15 14:42
 */
@Component
public class DubboConfig {

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setCheck(false);
        consumerConfig.setTimeout(20000);
        return consumerConfig;
    }
}
