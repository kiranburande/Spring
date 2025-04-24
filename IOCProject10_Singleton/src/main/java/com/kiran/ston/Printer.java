package com.kiran.ston;

public class Printer 
{
	private static Printer INSTANCE;

	private Printer() {
	}
	
	public static Printer getInstance()
	{
		if(INSTANCE==null)
			INSTANCE = new Printer();
		
		return INSTANCE;
	}
	
	public void printMessage(String msg)
	{
		System.out.println(msg);
	}
	
}
