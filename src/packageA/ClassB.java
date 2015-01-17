package packageA;

public class ClassB extends ClassA {
	
	public void test(){
		super.noTag = 2;
		super.pro =2;
		super.pub =3;
		//在同一个包中的子类，可以引用无修饰 protected 和 public
		
		
		
	}
	
	public void test2(){
		ClassA a = new ClassA();
		a.pub = 2;
		a.noTag =1;
		a.pro =3;
		
	}
		
		
		
	
	

}
