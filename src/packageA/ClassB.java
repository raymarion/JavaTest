package packageA;

public class ClassB extends ClassA {
	
	public void test(){
		super.noTag = 2;
		super.pro =2;
		super.pub =3;
		//��ͬһ�����е����࣬�������������� protected �� public
		
		
		
	}
	
	public void test2(){
		ClassA a = new ClassA();
		a.pub = 2;
		a.noTag =1;
		a.pro =3;
		
	}
		
		
		
	
	

}
