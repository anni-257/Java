
import java.util.Scanner;

class SeparatDigits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		int rem;
		while(num!=0){
			rem=num%10;
			num=num/10;
			System.out.print(rem);
		}
		
		System.out.println("\nFinish..!!");
		
	}
}
