package com.springIdol.aopTest.entities;

import com.springIdol.aopTest.contract.Singer;
import com.springIdol.aopTest.contract.Song;
import com.springIdol.aopTest.excecptions.SingingException;

public class SaloonSinger implements Singer {

	private Song song ;
	//@Value("Jack") : we can have here a regular expression !
	private String name;
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sing() {
		if (song != null)
		{
			System.out.println("I AM "+name+" and here is my song \t' "+ song.sound()+" '");
			
		}
		else
		{
			try {
				throw new SingingException();
			} catch (SingingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
