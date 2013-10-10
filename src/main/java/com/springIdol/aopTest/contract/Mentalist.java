package com.springIdol.aopTest.contract;

public interface Mentalist {
	
	public void interceptThoughts(String thoughts , Object proxy);
	public String getThoughts();

}
