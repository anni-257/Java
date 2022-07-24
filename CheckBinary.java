import java.util.Scanner;

class CheckBinary{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Binary Number: ");
		String binary=sc.next();
		System.out.println("Binary Number: "+binary);
		if(binary.matches("[0-1]*")){
			System.out.println("This is a Valid Binary Number.");
		}else{
			System.out.println("This is not a Valid Binary number.");
		}
	}
}
