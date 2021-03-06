package com.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import java.io.IOException;

@EnableDubbo
@SpringBootApplication
@EnableHystrix
public class ProviderApplication {
    public static void main(String[] args)  {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
//        context.start();
//        System.in.read();
        SpringApplication.run(ProviderApplication.class,args);
        System.out.println("启动成功了");
    }
}
