
interface Test1{

	void meth1();
	void meth2();
}

class Test2 implements Test1{

	public void meth1(){System.out.println("This is a method1");}
	
	public void meth2(){System.out.println("This is a method2");}
	
	public void meth3(){System.out.println("This is a method3");}
	
}

class Main{
	public static void main(String arg[]){
		Test1 obj=new Test2();
		obj.meth1();
		obj.meth2();
		//obj.meth3();
	}
}


