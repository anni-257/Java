import java.lang.*;
import java.util.Scanner;

class Arithmatic{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int num;
		float height,base;
		double area;
		float a,b,c,s;
		System.out.println("Area of a triangle\n");
		System.out.println("Enter your choice:\n1.with Height\n2.without height");
		System.out.print("Choice: ");
		num=sc.nextInt();
		switch(num){
			case 1:System.out.println("Enter Height and Base.");
				height=sc.nextFloat();
				base=sc.nextFloat();
				area=base*height/2f;
				System.out.println("Area of a Triangle: "+area);
				break;
			case 2:System.out.println("Enter 3 sides of triangle");
				System.out.print("side a: ");
				a=sc.nextFloat();
				System.out.print("side b: ");
				b=sc.nextFloat();
				System.out.print("side c: ");
				c=sc.nextFloat();
				s=(a+b+c)/2f;
				area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
				System.out.println("Area of a Triangle: "+area);
				break;
				
				
		
		}
	
	}

}
