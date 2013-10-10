package com.springIdol.aopTest.excecptions;

public class SingingException extends Exception {


	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return super.getMessage()+"Exception while performing the song";
	}

}
