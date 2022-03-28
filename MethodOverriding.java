class Parent{
	public void display(){
		System.out.println("Hello Parent");
	}
}

class Child extends Parent{
	public void display(){
		System.out.println("Hello Child");
	}
}

class Main{
	public static void main(String arg[]){
		Parent p=new Parent();
		p.display(); // this will call Parent's display
		Child c=new Child();
		c.display(); // thid will call child's display
		
		Parent pc= new Child();
		pc.display(); // this will call child's display
	}
}
