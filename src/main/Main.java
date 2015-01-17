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
		
		String str1 = "abs";
		String str2 = str1;//"abs";
		str1 = str1+"123";
		System.out.println(str1);
		System.out.println(str2);
		
		//test the encapsulate of OOP
		ClassA a = new ClassA();
		a.pub = 2;
		

	}

}
