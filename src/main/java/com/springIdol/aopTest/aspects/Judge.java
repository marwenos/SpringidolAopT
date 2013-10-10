package com.springIdol.aopTest.aspects;

import javax.inject.Inject;
import javax.inject.Named;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.springIdol.aopTest.contract.CriticismEngine;


@Aspect
@Component("judge")
public class Judge {

	@Inject
	@Named("criticism_impl")
	private CriticismEngine c_engine;
	public Judge(CriticismEngine c_engine) {
		super();
		this.c_engine = c_engine;
	}
	public Judge() {
		super();
	}

	public CriticismEngine getC_engine() {
		return c_engine;
	}
	public void setC_engine(CriticismEngine c_engine) {
		this.c_engine = c_engine;
	}
	@Pointcut("execution ( * com.springIdol.aopTest.contract.Singer.sing(..) )")
	public void critics ()
	{	
	}
	@After("critics()")
	public void criticize ()
	{
		System.out.println(c_engine.Criticize());
	}
	

}
