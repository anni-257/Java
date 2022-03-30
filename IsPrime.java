
import java.util.Scanner;

class IsPrime{
	static boolean check(int n){
		if(n==1){
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		
		System.out.println(num+" is a prime number: "+check(num));
		
	
	}
}
