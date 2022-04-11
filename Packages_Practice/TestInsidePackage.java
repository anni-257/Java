
package mypack1;
//import mypack1.Demo1;

class TestInsidePackage{

	public static void main(String args[]){
		Demo1 d1=new Demo1();
		
		d1.display();
		System.out.println("Addition: "+(d1.b+d1.c+d1.d));
	
	}
}
