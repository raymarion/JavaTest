package packageA;


public class ClassD {
	
	
	public void test(){
		ClassA a = new ClassA();
		a.pub = 2;
		a.noTag = 1;
		a.pro =3;
		
		// 同一个包中的非子类，可以引用 public 无修饰 和 protected
	}
	

}
