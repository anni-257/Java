import java.lang.*;

class Parent{
	Parent(){
		System.out.println("Parent Constructor...");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Constructor...");
	}
}

class GrandChild extends Child{
	GrandChild(){
		System.out.println("GrandChild Constructor...");
	}
}

class ConstrInInheritance{
	public static void main(String arg[]){
	
		GrandChild c=new GrandChild();
		
	}
}
