import java.util.Scanner;

class Gcd{

	int HCF(int num1, int num2){
		
			while(num1!=num2){
			
				if(num1>num2)	num1=num1-num2;
				
				else	num2=num2-num1;
			}
			return num1;
		}
		
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		
		
		
		Gcd obj=new Gcd();
		
		System.out.print("Enter Number1: ");
		num1=sc.nextInt();
		System.out.print("Enter Number2: ");
		num2=sc.nextInt();
		
		
		System.out.println("highest Common Factor is: "+obj.HCF(num1,num2));
	}
}
