import java.util.*;

class StringMethods{
	public static void main(String arg[]){
		String str="Java Methods"; // String Pool
		char []c={48,57,65,90,97,122};
		char []b={48,57,65,90,97,122};
		String str1="java";
		String str2="java";
		String str11=new String("java"); // Heap 
		String str22=new String("java"); // heap
		System.out.println("str= "+str);
		System.out.println("str1= "+str11);
		System.out.println("str2= "+str22);
		boolean a=(str11==str22);
		System.out.println("Boolean= "+a);
		
		
	}
}
