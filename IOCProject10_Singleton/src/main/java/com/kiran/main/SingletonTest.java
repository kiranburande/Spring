package com.kiran.main;

import com.kiran.ston.Printer;

public class SingletonTest 
{
	public static void main(String[] args) {
		Printer printer1 = Printer.getInstance();
		
		Printer printer2 = Printer.getInstance();
		
		System.out.println(printer1.hashCode()+"       "+printer2.hashCode());
	}
}
