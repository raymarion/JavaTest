package main;

import packageA.ClassA;

public class ClassC extends ClassA {
	
	protected int proc;
	
	public void Test(){
		super.pro =1;
		super.pub =1;
		// 不同包中的子类 可以引用 protected public。不可引用无修饰和private 而且是用super 的形式
		 
		
		
	}

	public void test2(){
		ClassA a = new ClassA();
		a.pub = 2;
		//不用super 的形式只能引用 public 和不同包中的非子类一样。
		
	}
}
