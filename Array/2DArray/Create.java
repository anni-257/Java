import java.util.Scanner;

class Create{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int b[]={1,3,3,4};
		System.out.println(b);
		int A[][];
		
		
		int row,col,val;
		System.out.print("Enter Row Number: ");
		row=sc.nextInt();
		System.out.print("Enter Column Number: ");
		col=sc.nextInt();
		A=new int[row][col];
		System.out.println(A);
		
		
		System.out.println("Enter Elements");
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++){
				val=sc.nextInt();
				A[i][j]=val;
			}
		}
		System.out.println("Matrix:\n");
		
		for(int x[]:A){
			for(int y: x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
	}
}
