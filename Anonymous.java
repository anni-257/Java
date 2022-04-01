interface My{
	void display();
}

class Outer{
	
	public void outerDisplay(){
		My m=new My(){public void display(){System.out.println("This is an Anonymous class...");}};
		m.display();
		}
	
}

class Main{
	public static void main(String arg[]){
		Outer o=new Outer();
		o.outerDisplay();
		
	}
}
