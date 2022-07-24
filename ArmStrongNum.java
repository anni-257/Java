import java.util.Scanner;
					//narcissistic number= 9474= 9^4+4^4+7^4+4^4= 9474
class ArmStrongNum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		int sum=0, num2=num,rem;
		while(num!=0){
			rem=num%10;
			sum+=rem*rem*rem; // Armstrong number Condn 153= 1^3+5^3+3^3=153
			num/=10;
		}
		if(sum==num2){
			System.out.println("True, Number is Armstrong.");
		}
		else{
			System.out.println("False, Number is not Armstrong.");
		}
		
		
	}
}
