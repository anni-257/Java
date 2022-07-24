import java.lang.*;
import java.util.*;

class QuadRoot{
	public static void main(String arg[]){
		float a,b,c;
		double r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Coeff. of x^2: ");
		a=sc.nextFloat();
		System.out.print("Enter Coeff. of x: ");
		b=sc.nextFloat();
		System.out.print("Enter Coeff. of constant: ");
		c=sc.nextFloat();
		System.out.println("Roots of given Quadratic Equation is: ");
		r1=(-b+Math.sqrt((b*b)-(4*a*c)))/2*a;
		r2=(-b-Math.sqrt((b*b)-(4*a*c)))/2*a;
		System.out.println("r1: "+r1+"\t"+"r2: "+r2);
		
		
	
	
	}

}
