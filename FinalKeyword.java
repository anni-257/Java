class Super{

	final int MAX=1;
	final static int AMOUNT;
	final int MIN;
	
	static{
		// Intialization valid only for final static variable inside static block
		System.out.println("This is static block");
		AMOUNT=100;
	}
	
	Super(){
		System.out.println("This is a class constructor");
		MIN=0;
	}
	
	final void display(){
		System.out.println("Hello...");
	}

}

class Sub extends Super{
	
	
	/*public void display(){
		System.out.println("Hii");
	} We cannot Override final methods */ 
	
	public void meth(){
		System.out.println("Method1");
	}
	
}

final class Parent{

}

/*class Child extends Parent{

} We cannot Extends final class to another child class */

class Main{
	public static void main(String arg[]){
		Sub sb=new Sub();
		sb.display();
	}
}


