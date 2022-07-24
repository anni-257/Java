import java.lang.*;
import java.util.Scanner;

class CubiodArea{
	public static void main(String args[]){
		int choice;
		float height,length,breadth;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("*** Area of Room ***");
		
		
		System.out.println("\t Enter your choice:\n1.Area of Front/Back.\n2.Area of Left/Right.\n3.Area of Top/Bottom.\n4.Volume of Room\n");
		System.out.print("Your choice: ");
		choice=sc.nextInt();
		switch(choice){
		case 1: System.out.print("Enter Height of Room: ");
			height=sc.nextFloat();
			System.out.print("Enter length of Room: ");
			length=sc.nextFloat();
			area=height*length;
			System.out.print("\nArea of Front/Back : "+area+" sq.m^2");
			break;
		case 2: System.out.print("Enter Height of Room: ");
			height=sc.nextFloat();
			System.out.print("Enter Breadth of Room: ");
			breadth=sc.nextFloat();
			area=height*breadth;
			System.out.print("\nArea of Left/Right: "+area+" sq.m^2");
			break;
		case 3: System.out.print("Enter length of Room: ");
			length=sc.nextFloat();
			System.out.print("Enter Breadth of Room: ");
			breadth=sc.nextFloat();
			area=length*breadth;
			System.out.print("\nArea of Top/Bottom: "+area+" sq.m^2");
			break;
		case 4: System.out.print("Enter Height of Room: ");
			height=sc.nextFloat();
			System.out.print("Enter Breadth of Room: ");
			breadth=sc.nextFloat();
			System.out.print("Enter length of Room: ");
			length=sc.nextFloat();
			area=height*breadth*length;
			System.out.print("\nVolume of a Room: "+area+" sq.m^2");
			break;
		
		}
		 
		
	}

}

