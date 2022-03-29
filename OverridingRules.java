
class A{	}

class B extends A{	}


class Super{

	public void display(){
		System.out.println("Super...");
	}
	
	public A fun(){
		return new A();
	}
}

class Sub extends Super{
	@Override
	// public int display() is not allowed.. different datatypes are not allowed in Overriding
	// public void display(int x) not allowed in Overriding.. it is a Overloaded Method
	public void display(){
		System.out.println("Sub...");
	}
	public B fun(){
		return new B();
	}
}

class Test{

public static void main(String arg[]){
	Super su=new Sub();
	su.display();
	}
}
