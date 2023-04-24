package com.epec.practice.pattern.observer;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author zhaoxianxing
 * @Date 2023/4/21 15:12
 */
@Component
public class ChangeEventListener implements ApplicationListener<ChangeEvent> {
//    @EventListener
////    public void receiveMsg(OrderStatusChangeEvent event) {
////        System.out.println("接受消息：" + JSON.toJSONString(event));
////    }

    @Async
    @Override
    public void onApplicationEvent(ChangeEvent orderStatusChangeEvent) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接收消息" + JSON.toJSONString(orderStatusChangeEvent));
    }
}


