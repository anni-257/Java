class OuterStatic{
	static int x=10;
	int y=20;
	
	static class InnerStatic{
		void display(){
			System.out.println("x= "+x);
			//System.out.println("y= "+y);
		}
	}
}

class Main4{
	public static void main(String arg[]){
		OuterStatic st=new OuterStatic();
		new OuterStatic.InnerStatic().display();
	}
}
