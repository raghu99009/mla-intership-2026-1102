package com.test;

interface Inf1{
	float pi = 3.14f;
	
	void disp();
	void cat();
	default void human() {
		System.out.println("default inf");
		animals();
	}
	static String greetUser(String msg) { //can not override
		return msg;
	}
	private void animals() {
		System.out.println("Private method");
	}
	/*
	public Inf1() {
		
	}*/
}

interface Inf2{
   void book();
}

abstract class Abs1{
	public Abs1() {
		
	}
	public abstract void fox();
	
	public void color() {
		System.out.println("implemented methods ads1");
	}
}

class Impl1 extends Abs1 implements Inf1,Inf2{
	@Override
	public void fox() {
		System.out.println("abs implemented");
	}	
	@Override
	public void  disp() {
		System.out.println("inf1 implemented");
	}
	@Override
	public void cat() {
		System.out.println("inf1 implemented");
	}
	@Override
	public void book() {
		System.out.println("inf2 implemented");
	}
}
public class exp1 {
	public static void main (String args[]) {
		Impl1 obj = new Impl1();
		obj.book();
		obj.cat();
		obj.disp();
		obj.human();
		obj.fox();
		obj.color();
		System.out.println(Inf1.greetUser("Hello MLA Coders...."));
	}
}
/*how many ways we can create object for the class
 *  NEW operator
 *  factory method
 *  clone() method
 *  Class.forName()
 * 
 * 
 * 
 * 
 * 
 * 
 */
