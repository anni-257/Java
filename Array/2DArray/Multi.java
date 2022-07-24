import java.util.Scanner;

class Matrix{
	Scanner sc;
	int row;
	int col;
	int val;
	int A[][];
	
		Matrix(){
			sc=new Scanner(System.in);
		}
		void init(){
		
			System.out.print("Enter number of Rows: ");
			row=sc.nextInt();
			System.out.print("Enter number of Column: ");
			col=sc.nextInt();
			A=new int[row][col];
		}
		
		void fill(){
			System.out.println("Enter All Elements");
			for(int i=0;i<A.length;i++){
				for(int j=0;j<A[i].length;j++){
					val=sc.nextInt();
					A[i][j]=val;
				}
			}
		}
		
		void display(){
			for(int x[]:A){
				for(int y:x){
					System.out.print(y+" ");
				}
				System.out.println();
			}
		}
		
		
}

class Multi{
	public static void main(String arg[]){
		System.out.println("M1 Matrix initialization");
		Matrix m1=new Matrix();
		m1.init();
		m1.fill();
		System.out.println("M2 Matrix initialization");
		Matrix m2=new Matrix();
		m2.init();
		m2.fill();
		Matrix m3=new Matrix();
		System.out.println("M3 Matrix initialization");
		m3.init();
		
		for(int i=0;i<m1.A.length;i++){
			for(int j=0;j<m1.A[i].length;j++){
				m3.A[i][j]=0;
				for(int k=0;k<m1.A.length;k++){
					m3.A[i][j]=m3.A[i][j]+m1.A[i][k]*m2.A[k][j];
				}
				
			}
		}
		System.out.println("M3 Matrix");
		m3.display();
		
		
	}
}
