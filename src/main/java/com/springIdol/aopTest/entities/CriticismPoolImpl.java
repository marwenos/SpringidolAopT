package com.springIdol.aopTest.entities;

import java.util.List;

import com.springIdol.aopTest.contract.CriticismEngine;
public class CriticismPoolImpl implements CriticismEngine {
	public CriticismPoolImpl() {
		super();
	}
	private List<String> c_pool;
	
	public void setCriticismPool(List<String> c_pool) {
		this.c_pool=c_pool;
	}
	public String Criticize ()
	{
		return c_pool.get((int)(Math.random()*4));
	}
}
