import java.util.Scanner;

class pattern2{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int row=sc.nextInt();
		System.out.print("Enter Number of Column: ");
		int col=sc.nextInt();
		System.out.println();
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if(j<=row-i){
					System.out.print("- ");
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
