import java.util.Scanner;

class Max{

	static int Max(int x,int y){
	
		if(x>y) return x;
		
		return y;
	}
	
	static public void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter value for a: ");
		a=sc.nextInt();
		System.out.print("Enter value for b: ");
		b=sc.nextInt();
		
		int max=Max(a,b);
		System.out.println("Max val: "+max);
		
	
	}
}
