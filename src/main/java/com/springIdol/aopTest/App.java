package com.springIdol.aopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springIdol.aopTest.contract.Singer;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("AopTestContext.xml");
    	Singer singer = (Singer) context.getBean("John");
    	singer.sing();
    }
}
