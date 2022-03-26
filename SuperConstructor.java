
import java.lang.*;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(){
		System.out.println("Default Parent Constructor");
		length=breadth=1;
	}
	
	Rectangle(int l,int h){
		System.out.println("Parameterize Parent Constructor");
		length=l;
		breadth=h;
	}
	
	
}

class Cuboid extends Rectangle{
	int height;
	
	Cuboid(){
		System.out.println("Default child Constructor");
		height=1;
	}
	Cuboid(int l, int b, int h){
		super(l,h);
		height=h;
	}
	
	int volume(){
		return length*breadth*height;
	}
}

class SuperConstructor{
	public static void main(String arg[]){
		Cuboid c=new Cuboid(5,3,10);
		System.out.println(c.volume());
		
	}
}
