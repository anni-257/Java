import java.util.Scanner;

class NibbleProb{
	public static void main(String arg[]){
	
		byte a=0,b=5;
		System.out.println("a= "+Integer.toBinaryString(a)+" b= "+Integer.toBinaryString(b));
		a=(byte)(a|b);
		System.out.println("a= a|b "+Integer.toBinaryString(a));
		b=9;
		System.out.println("b= "+Integer.toBinaryString(b));
		b=(byte)(b<<4);
		System.out.println("b=b<<4 "+Integer.toBinaryString(b));
		a=(byte)(a|b);
		System.out.println("a=a|b "+Integer.toBinaryString(a));
		
		
	
	}
}


