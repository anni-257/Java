class Outer{
	int x=10;
	
	class Inner{
		int y=20;
		
		public void innerDisplay(){
			System.out.println("x= "+x+" "+"y= "+y);
		}
	}
	
	public void outerDisplay(){
		Inner i=new Inner();
		
		System.out.println("x= "+x+" "+"y= "+i.y);
	}
}

class Main{
	public static void main(String arg[]){
	
		System.out.println("Method1: ");
		Outer o=new Outer();
		o.outerDisplay();
		
		System.out.println("Method2: ");
		Outer.Inner i=new Outer().new Inner();
		i.innerDisplay();
	
	}

}
