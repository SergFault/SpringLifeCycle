package ru.springcontext.quoter;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("Spring-context.xml");
        System.out.println();
        System.out.println(Arrays.asList(appCtx.getBeanDefinitionNames()));
        appCtx.getBean(QuoterImplementation.class).sayQuote();
    }
}
