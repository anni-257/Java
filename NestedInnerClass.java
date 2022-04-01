

class Outer{
	int x=10;
	
	class Inner{
		int y=30;
		
		public void innerDisplay(){
			System.out.println("Inner Display x= "+x+" "+"y= "+y);
		}
	}
	
	public void outerDisplay(){
		Inner i=new Inner();
		i.innerDisplay();
		System.out.println("Outer Display x= "+x+" "+"y= "+i.y);
	}
	
}

class Main{
	public static void main(String arg[]){
		Outer o=new Outer();
		o.outerDisplay();
	}
}
