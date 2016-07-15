package com.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import tony.dubbo.demo.DemoService;

/**
 * Created by Tony on 16/7/15.
 */
public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[] {"classpath*:spring/appcontext-consumer.xml"}
                        );
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
    }

}
