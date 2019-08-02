package com.liqian.service.impl;

import com.liqian.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Administrator
 * @Date: 2019/7/30 0030 15:08
 * @Description:
 */
public class MyMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "file:F:/myProject/dubbo/dubbo-provider/src/main/resources/spring/spring-service.xml" });
        context.start();

//        DemoService demoService = (DemoService) context.getBean("demoServiceImpl");
//        int result = demoService.countUser();
//        System.out.println(result);

        System.out.println("按任意键退出");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        com.alibaba.dubbo.container.Main.main(args);
    }
}
