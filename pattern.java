import java.util.Scanner;

class pattern{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Rows: ");
		int row=sc.nextInt();
		System.out.print("Enter number of Column: ");
		int col=sc.nextInt();
		System.out.println();
		
		for(int i=1;i<=row;i++){
		for(int k=1;k<i;k++){
					System.out.print("- ");
				}
			for(int j=1;j<=col-i+1;j++){
				
				
				System.out.print("* ");
			
			}
			System.out.println();
		}
		
	
	}
}
