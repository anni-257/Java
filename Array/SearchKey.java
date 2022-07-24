import java.util.Scanner;

class SearchKey{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a[],val;
		System.out.print("Enter size of Array: ");
		int size=sc.nextInt();
		a=new int[size];
		System.out.println("Enter Array Values");
		
		for(int i=0;i<size;i++){
			val=sc.nextInt();
			a[i]=val;
		}
		System.out.print("Array: ");
		for(int x: a) System.out.print(x+" ");
		System.out.println();
		System.out.println("----- Seach a Key -----");
		System.out.print("Enter Key: ");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++){
			if(key==a[i]){
				System.out.println("Key Element is Found");
				System.exit(0);
			}
		}
		
		System.out.println("Key Element is not Found");
	}
}
