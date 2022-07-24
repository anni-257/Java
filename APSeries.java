import java.util.Scanner;

class APSeries{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a0,diff,terms,temp;
		System.out.print("Enter First Term of an AP Series: ");
		a0=sc.nextInt();
		System.out.print("Enter Difference: ");
		diff=sc.nextInt();
		System.out.print("Enter Number of Terms in Series: ");
		terms=sc.nextInt();
		//System.out.print("AP Series: ");
		System.out.print("GP Series: ");
		for(int i=0;i<terms;i++){
			System.out.print((a0)+", ");
			a0=a0*diff;
		}
		System.out.println("\n");
	
	}
}
