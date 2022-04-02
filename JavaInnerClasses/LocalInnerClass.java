class LocalOuter{
	int x=30;
	
	public void outerDisplay(){
		class LocalInner{
			public void innerDisplay(){
				System.out.println("This is Local Inner Class "+x);
			}
		}
		
		new LocalInner().innerDisplay();
	}
}

class Main2{

	public static void main(String arg[]){
		LocalOuter o=new LocalOuter();
		o.outerDisplay();
	
	}
}
