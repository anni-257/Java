import java.util.Scanner;

class SecondMaxEle{
	public static void main(String arg[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array: ");
		int num=sc.nextInt();
		int a[],max1,max2,val;
		a=new int[num];
		System.out.println("Enter Elements");
		
		for(int i=0;i<a.length;i++){
			val=sc.nextInt();
			a[i]=val;
		}
		
		max1=max2=a[0];
		
		for(int x: a){
			if(max1<x){
				max2=max1;
				max1=x;
			}
			else if(max2<x){
				max2=x;
			}
		}
		
		System.out.println("First: "+max1+" "+" Second: "+max2);
	}
}
