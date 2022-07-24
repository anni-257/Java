import java.lang.*;
import java.util.*;

class KeybRead{
	public static void main(String arg[]){
	
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.print("May I known your name: ");
		name=sc.nextLine();
		System.out.println("Welcome "+name);
		sc.close();
	
	}
}
