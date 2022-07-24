import java.util.Scanner;

class reverseDigits{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		
		int n,rem,rev=0,count=0;
		System.out.print("Enter number: ");
		n=sc.nextInt();
		while(n!=0){
		
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			count++;
		}
		
		System.out.println("\nInput Number: "+n);
		System.out.println("reverse number: "+rev);
		System.out.println("Number of Digits: "+count);
		
	}
}
