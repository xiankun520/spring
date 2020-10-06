package com.xiaomo.springinitTest;

import com.xiaomo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springinit {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context);
        User user = (User) context.getBean("User");
        User user1 = (User) context.getBean("User");
        System.out.println(user==user1);
    }

}
