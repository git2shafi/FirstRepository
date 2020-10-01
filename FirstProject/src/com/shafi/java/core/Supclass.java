package com.shafi.java.core;

public class Supclass extends SubClass {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to my first project");
		Supclass sp = new Supclass();
		sp.message();

	}
	
	public void message() {
		
		System.out.println("Welcome to my SuperClass");
	}

}
