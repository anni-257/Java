import java.util.Scanner;

class Function{
	int n;
	int size;
	int val;
	int a[];
	
	void init(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		size=sc.nextInt();
		System.out.print("Enter number of numbers: ");
		n=sc.nextInt();
		a=new int[size];
		System.out.println("Enter Elements: ");
		for(int i=0;i<n;i++){
			val=sc.nextInt();
			a[i]=val;
		}
	}
	void leftRotation(int a[]){
		int temp=a[0];
		for(int i=0;i<a.length-1;i++){
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
	}
	
	void rightRotation(int a[]){
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--){
			a[i]=a[i-1];
		}
		a[0]=temp;
		
	}
	
	void insert(int index,int val){
		for(int i=n;i>index;i--){
			a[i]=a[i-1];
		}
		a[index]=val;
	}
	
	void display(){
		System.out.print("Array Elements: ");
		for(int x: a){
			System.out.print(x+" ");
		}
		
		System.out.println();	
	}

}
class Rotation{
public static void main(String arg[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Size of Array: ");
	int size=sc.nextInt();
	int a[]=new int[size];
	int val;
	System.out.println("----Enter all Elements----");
	for(int i=0;i<a.length;i++){
		val=sc.nextInt();
		a[i]=val;
	}
	
	System.out.println("*** Rotation of Array ***\n");
	System.out.println("<< Left Rotation ");
	Function r=new Function();
	r.leftRotation(a);
	for(int x: a){
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println(">> Right Rotation ");
	r.rightRotation(a);
	for(int x:a){
		System.out.print(x+" ");
	}
	System.out.println();
	r.init();
	r.display();
	r.insert(3,11);
	r.display();
	
	
}
}
