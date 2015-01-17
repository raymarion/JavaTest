/**
 * 
 */
package main;

import packageA.ClassA;

/**
 * @author ray
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test String 
		String str1 = "abs";
		String str2 = "abs";//"abs";
		str2 = "123";
		System.out.println(str1);
		System.out.println(str2);
		
		//test the encapsulate of OOP
		ClassA a = new ClassA();
		a.pub = 2;
		ClassC c = new ClassC();
		c.proc = 2;
		
		
		System.out.println("test the number operation with String"+1+2);
		
		

	}

}
