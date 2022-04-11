
import mypack1.Demo1;

class Demo2 extends Demo1{

	void show(){
		display();
		System.out.println("Addition: "+(a+b+c+d));
	}
	

}

class TestSubClass{
	public static void main(String args[]){
	
		Demo2 d2=new Demo2();
		d2.show();
	}
}
