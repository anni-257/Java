import java.util.Scanner;

class CheckHex{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Hexadecimal Number: ");
		String hex=sc.next();
		System.out.println("Given Hexadecimal Number: "+hex);
		if(hex.matches("[0-9a-f]*")){
			System.out.println("This is valid Hexadecimal number.");
		}else{
			System.out.println("This is not valid Hexadecimal number.");
		}
	}
}
