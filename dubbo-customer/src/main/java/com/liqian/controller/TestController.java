package com.liqian.controller;

import com.liqian.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @Author: Administrator
 * @Date: 2019/8/1 0001 15:46
 * @Description:
 */
@Controller
public class TestController {


    /**
     * dubbo-provider注册得到zookeeper时使用了内网ip
     * 导致消费端无法访问
     * 修改/etc/hosts文件  内网ip  公网ip
     * 如 172.18.138.182    112.74.59.132
     */


    @Resource
    private DemoService demoService;

    @ResponseBody
    @RequestMapping("test")
    public Integer test() {
        return demoService.countUser();
    }


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"file:F:/myProject/dubbo/dubbo-customer/src/main/resources/spring/spring-dubbo-customer.xml"});
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        int count = demoService.countUser(); // 执行远程方法

        System.out.println( count ); // 显示调用结果
        System.out.println("按任意键退出");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
