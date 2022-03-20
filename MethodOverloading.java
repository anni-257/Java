import java.util.Scanner;

class MethodOverloading{
	int Max(byte x, byte y){
		System.out.println("byte");
		return x>y ? x:y;
	}
	
	int Max(int x,int y){
		System.out.println("int");
		return x>y ? x:y;
	}
	
	float Max(float x, float y){
		System.out.println("float");
		return x>y?x:y;
	}
	
	int Max(int x,int y,int z){
		System.out.println("int3");
		return x>y && x>z? x:(y>z?y:z);
	}
	
	
	public static void main(String arg[]){
		byte a=1,b=2;
		MethodOverloading obj=new MethodOverloading();
		System.out.println("Max Element: "+obj.Max(10,13));// calling int parameter
		System.out.println("Max Element: "+obj.Max(a,b));// calling byte parameter
		System.out.println("Max Element: "+obj.Max(4f,5f));// calling float parameter
		// int parameter compatible with flaot, double as well but not byte, and short 
	}
}
