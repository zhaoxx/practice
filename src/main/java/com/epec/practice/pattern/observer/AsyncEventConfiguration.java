package com.epec.practice.pattern.observer;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.*;

/**
 * @Description
 * @Author zhaoxianxing
 * @Date 2023/4/24 9:30
 */
@Configuration
@EnableAsync
public class AsyncEventConfiguration implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        return new ThreadPoolExecutor(0, 10,
                60L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(100),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
    }
}
