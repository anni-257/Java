import java.util.Scanner;

class ValidEmailCheck{
	public static void main(String arg[]){
		System.out.print("Enter your valid Email Id: ");
		String email;
		Scanner sc=new Scanner(System.in);
		email=sc.next();
		System.out.println("Is valid Email address: "+ email.matches("\\w*@gmail.[a-z]*"));
		int i=email.indexOf("@");
		String User_Name=email.substring(0,i);
		String Domain=email.substring(i+1);
		System.out.println("\n-----Your Information-----");
		System.out.println("User_name: "+User_Name);
		System.out.println("Domain name: "+Domain);
	}
}
