package ru.springcontext.quoter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("Spring-context.xml");
        System.out.println();
        System.out.println(Arrays.asList(appCtx.getBeanDefinitionNames()));
        while (true) {
            Thread.sleep(200);
            appCtx.getBean(Quoter.class).sayQuote();
        }
    }
}
