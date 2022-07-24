import java.util.Scanner;

class Fibonacci{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a0=0,a1=1,c=0,terms;
		System.out.print("Number of terms: ");
		terms=sc.nextInt();
		
		System.out.print("Fibonacci Series: "+a0+", "+a1+", ");
		
		for(int i=0;i<terms-2;i++){
			c=a0+a1;
			System.out.print(c);
			if(i!=terms-3)
			System.out.print(", ");
			a0=a1;
			a1=c;
		}
		System.out.println();
	
	}
}
