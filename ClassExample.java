import java.util.Scanner;

class Car{
	private String Cname;
	private String color;
	private String model;
	Scanner sc;
	
	Car(){
		sc=new Scanner(System.in);
		System.out.print("Enter Car Name: ");
		Cname=sc.nextLine();
		System.out.print("Enter Car Model: ");
		color=sc.nextLine();
		System.out.print("Enter Car Color: ");
		model=sc.nextLine();
		
	}
	void Accelerate(){
		System.out.println("Car successfully accelerated");
	}
	void Stop(){
		System.out.println("Break applied..");
	}
	
	void display(){
		System.out.println("\n-----Car information-----");
		System.out.println("Car Name: "+Cname);
		System.out.println("Car Color: "+color);
		System.out.println("Car Model: "+model);
	}
	

}
class ClassExample{
	public static void main(String arg[]){
		System.out.println("Fill information for Car1");
		Car c1=new Car();
		System.out.println("Fill information for Car2");
		Car c2=new Car();
		System.out.println("Car1 Information");
		c1.Accelerate();
		c1.Stop();
		c1.display();
		
		System.out.println("Car2 Information");
		c2.Accelerate();
		c2.Stop();
		c2.display();
		
		
	}
}
