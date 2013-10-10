package com.springIdol.aopTest.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Audience {
	
	//a method that does nothing but defines the point-cut
	@Pointcut("execution ( * com.springIdol.aopTest.contract.Singer.sing(..) )")
	public void performance()
	{	
	}
	@AfterReturning("performance()")
	public void applaud ()
	{
		System.out.println("AUDIENCE APPLAUDING !");
	}
	@Before("performance()")
	public void takeSits ()
	{
		System.out.println("AUDIENCE IS TAKING SITS !");
		System.out.println("HELLO !");
	}
	@AfterThrowing("performance()")
	public void demandRefund ()
	{
		System.out.println("AUDIENCE IS DEMANDING REFUND !");
	}
	//this is the around advice wich allows us to manupulate 
	public void watchPerformence (ProceedingJoinPoint joinPoint)
	{
		try {
			takeSits();
			long begin = System.currentTimeMillis();
			joinPoint.proceed();
			long time = System.currentTimeMillis()-begin;
			System.out.println("the performence took : "+time);
			applaud ();
		} catch (Throwable e) {
			demandRefund();
		}
	}

}
