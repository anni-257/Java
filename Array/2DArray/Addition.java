import java.util.Scanner;

class Init{
	int row;
	int val;
	int col;
	int A[][];
	Scanner sc;
	
	Init(){
		sc=new Scanner(System.in);
	}
	
	void Initial(){
		
		System.out.print("Enter number of Rows: ");
		row=sc.nextInt();
		System.out.print("Enter number of Column: ");
		col=sc.nextInt();
		A=new int[row][col];
	
		
	}
	
	void Fill(){
		System.out.println("Enter Elements");
		for(int i=0;i<A.length;i++){
			for(int j=0;j<A[i].length;j++){
				val=sc.nextInt();
				A[i][j]=val;
			}
		}
	}
	
	void Display(){
		for(int x[]:A){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	
}
class Addition{
static public void main(String arg[]){
	Init m3=new Init();
	System.out.println("Initialization Matrix 1");
	Init m1=new Init();
	m1.Initial();
	m1.Fill();
	System.out.println("Initialization Matrix 2");
	Init m2=new Init();
	m2.Initial();
	m2.Fill();
	System.out.println("Display M1");
	m1.Display();
	System.out.println("Display M2");
	m2.Display();
	System.out.println("Initialization Matrix 3");
	m3.Initial();
	
	for(int i=0;i<m1.A.length;i++){
		for(int j=0;j<m1.A[i].length;j++){
			m3.A[i][j]=m1.A[i][j]+m2.A[i][j];
		}
	
	}
	
	System.out.println("Sum of Matrix 1 + Matrix 2");
	m3.Display();
	
}
}
	
	
