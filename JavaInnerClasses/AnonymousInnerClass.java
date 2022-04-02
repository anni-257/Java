abstract class Abst{
	public abstract void display();
}

class OuterAnonymous{


	Abst a=new Abst(){
		public void display(){
			System.out.println("This is an Anonymous Inner Class");
		}
	};


}

class Main4{
public static void main(String arg[]){
	OuterAnonymous oa=new OuterAnonymous();
	oa.a.display();
}
}
