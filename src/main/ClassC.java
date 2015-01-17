package main;

import packageA.ClassA;

public class ClassC extends ClassA {
	
	public void Test(){
		super.pro =1;
		super.pub =1;
		//
		 
		
	}

	public void test2(){
		ClassA a = new ClassA();
		a.pub = 2;
		
		
	}
}
