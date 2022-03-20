import java.util.Scanner;

class AreaOverloaded{

	static double area(double x, double y){
		return x*y;
	}
	
	static double area(double r){
		return Math.PI*r*r;
	}
	
	static double area(double x, double y,double h){
		return 0.5*(x+y)*h;
	}
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int choice;
		double a,b,c;
		AreaOverloaded obj=new AreaOverloaded();
		
		do{
			System.out.println("----- Area of a Shape -----\n");
			System.out.println("1. Area of Rectangle");
			System.out.println("2. Area of Circle");
			System.out.println("3. Area of Parallelogram");
			System.out.println("4. Area of trapiziam");
			System.out.println("0. EXIT... ");
			
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			switch(choice){
			
			case 1: System.out.print("Enter length: ");
				a=sc.nextDouble();
				System.out.print("Enter width: ");
				b=sc.nextDouble();
				System.out.println("Area of Rectangle: "+obj.area(a,b));
				break;
				
			case 2: System.out.print("Enter Radius of a Circle: ");
				a=sc.nextDouble();
				System.out.println("Area of Circle: "+obj.area(a));
				break;
				
			case 3: System.out.print("Enter length: ");
				a=sc.nextDouble();
				System.out.print("Enter height: ");
				b=sc.nextDouble();
				System.out.println("Area of Parallelogram: "+obj.area(a,b));
				break;
				
			case 4: System.out.print("Enter parallel side1: ");
				a=sc.nextDouble();
				System.out.print("Enter parallel side2: ");
				b=sc.nextDouble();
				System.out.print("Enter height of Trapiziam: ");
				c=sc.nextDouble();
				System.out.println("Area of trapiziam: "+obj.area(a,b,c));
				break;
				
			case 0: System.out.println("Exit...");
				break;
				
			default:
				System.out.println("Please enter Valid choice: ");	
				
				
		}
			
			
		
		}while(choice!=0);
		
		
	}
}
