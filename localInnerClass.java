class Outer{
	
	void outerDisplay(){
		System.out.println("This is an OuterClass... Display");
		class Inner{
			public void innerDisplay(){System.out.println("This is an InnerClass.. Display");}
		}
		
		Inner i=new Inner();
		// new Inner().innerDisplay();
		i.innerDisplay();
	}
}

class Main{
	public static void main(String arg[]){
		Outer o=new Outer();
		o.outerDisplay();
	}
}
