package com.pojo;

import com.scan.LoginController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaomin
 * @date 2020/6/20 20:55
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applications.xml");
//        Object myName = context.getBean("myName");
//        System.out.println(myName.getClass());
//         System.out.println(myName);

//        Object duck1 = context.getBean("duck1");
//
//        Object duck2 = context.getBean("duck2");
//        Object duckShop1 = context.getBean("duckShop");
//        Object duckShop2 = context.getBean("duckShop");
//        System.out.println(duck1);
//        System.out.println(duck2);
//        System.out.println(duckShop1==duckShop2);//作用域变化.不是同一地址了
        Object duck6 = context.getBean("duck6");
        System.out.println(duck6.getClass());
         System.out.println(duck6);

       LoginController loginController = (LoginController)context.getBean("loginController");
        System.out.println(loginController.getLoginService());
        System.out.println(loginController.getDuck3());



    }
}
