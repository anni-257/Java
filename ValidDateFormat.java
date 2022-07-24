import java.util.Scanner;

class ValidDateFormat{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String date= sc.next();
		System.out.println("Input Date: "+date);
		if(date.matches("[0-3][0-9]/[01][1-9]/[0-9]{4}"))
			System.out.println("Given Date Format is valid.");
		else{
			System.out.println("Given Date Formte is invalid.");  
		}		
	}
}
