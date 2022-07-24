import java.util.Scanner;

class NumberInWords{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		int rem;
		String str="";
		
		while(n!=0){
			rem=n%10;
			n=n/10;
			str=str+rem;
		}
		System.out.println("Reverse Number: "+str);
		for(int i=str.length()-1;i>-1;i--){
		
			switch(str.charAt(i)){
			
				case '0': System.out.print("Zero ");
						break;
				case '1': System.out.print("One ");
						break;
				case '2': System.out.print("Two ");
						break;
				case '3': System.out.print("Three ");
						break;
				case '4': System.out.print("Four ");
						break;
				case '5': System.out.print("Five ");
						break;
				case '6': System.out.print("Six ");
						break;
				case '7': System.out.print("Seven ");
						break;
				case '8': System.out.print("Eight ");
						break;
				case '9': System.out.print("Nine ");
						break;
			}
		}
		System.out.print("\n");
		
	
	}
}
