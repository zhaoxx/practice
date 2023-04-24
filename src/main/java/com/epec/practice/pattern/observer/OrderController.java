package com.epec.practice.pattern.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author zhaoxianxing
 * @Date 2023/4/21 16:10
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/cancel")
    public String cancel(String orderNo){
        ChangeEvent event = new ChangeEvent(this, orderNo);
        System.out.println("发送消息");

        applicationEventPublisher.publishEvent(event);

        System.out.println("发送消息结束");
        return "success.";
    }
}
