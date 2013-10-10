package com.springIdol.aopTest.entities;

import com.springIdol.aopTest.contract.Thinker;

public class Volunteer implements Thinker {
	private String thoughts;

	public void think(String thoughts) {
		this.thoughts=thoughts;
		System.out.println(thoughts);
	}
	public String getThoughts()
	{
		return thoughts;
	}
}