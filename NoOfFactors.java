import java.lang.Math;
import java.util.Scanner;

class NoOfFactors{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int num, cnt=0;
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		
		for(int i=1;i<=Math.sqrt(num);i++){
			if(num%i==0){
				cnt++;
				
				if(i!=num/i){
					cnt++;
				}
			}
			
			
		}
		System.out.println("It has "+cnt+" factor");
		
	}
}
