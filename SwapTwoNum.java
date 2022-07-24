import java.lang.*;
import java.util.Scanner;

class SwapTwoNum{
	public static void main(String arg[]){
		int a, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers to be Swapped.");
		System.out.print("Enter first Number: ");
		a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		b=sc.nextInt();
		System.out.println("a= "+a+" "+"b= "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a= "+a+" "+"b= "+b);
		
		
		
	}

}
