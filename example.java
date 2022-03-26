
class Parent{
	Parent(){
		System.out.println("Default Cons");
	}
	Parent(int a, int b){
		System.out.println("Parameterized Constructor");
	}
}

class Child extends Parent{ // for this class default constructor must.
	Child(){
		System.out.println("Default child Constructor");
	}
	Child(int a, int b){
		super(10,20);// without super constructor default constructor must be present.
		System.out.println("Parameterized child Constructor");
	}
}

class Main{
	public static void main(String arg[]){
		Child x=new Child(10,20);
	}
}
