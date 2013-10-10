package com.springIdol.aopTest.aspects;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.springIdol.aopTest.contract.Mentalist;

@Aspect
public class Magicien implements Mentalist {
	private String thoughts;
	@Pointcut("&quot;execution(* *.*(..)) &amp;&amp; args(t)&quot;")
	public void thinking()
	{
		
	}
	@Before("execution(* com.springIdol.aopTest.contract.Thinker.think(String)) and args(thoughts) and target(proxy)")
	public void interceptThoughts(String thoughts , Object proxy) {
		this.thoughts=thoughts;
		System.out.println("proxy class "+proxy.getClass().getName()+" Intercepting thoughts : "+thoughts);
	}
	public String getThoughts() {
		// TODO Auto-generated method stub
		return thoughts;
	}

}
