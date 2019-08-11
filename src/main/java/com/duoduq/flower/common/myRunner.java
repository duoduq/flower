package com.duoduq.flower.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Auther: Jack
 * @Date: 2019-07-30 15:34
 * @Description:
 */
@Component
public class myRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("我是初始化方法。。。。");
    }
}
