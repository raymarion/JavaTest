package main;

import packageA.ClassA;

public class ClassC extends ClassA {
	
	protected int proc;
	
	public void Test(){
		super.pro =1;
		super.pub =1;
		// ��ͬ���е����� �������� protected public���������������κ�private ��������super ����ʽ
		 
		
		
	}

	public void test2(){
		ClassA a = new ClassA();
		a.pub = 2;
		//����super ����ʽֻ������ public �Ͳ�ͬ���еķ�����һ����
		
	}
}
