package com.shafi.java.core;

public class SubClass extends Supclass {
	
public void message() {
		
		System.out.println("Welcome to my SubClass");
	}

	public void subMessage() {
	
	System.out.println("This is subMessage");
	}
	
	public void strStrBufferDuff() {
		
		String s = "Shafi";
		
		s.concat("Baba");
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("shafi");
		
		s1.append("baba");
		System.out.println(s1);
		
		 
	}
	
}