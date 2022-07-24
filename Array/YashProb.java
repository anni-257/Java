
class YashProb{

	public static void main(String arg[]){
		int A[]={1,2,3,4,5,6};
		
		System.out.println("Index based");
		for(int i=0;i<A.length;i++){
			A[i]++;
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
		System.out.println("For Each loop Value based");
		
		for(int i : A /* A.lenght */ ){
			System.out.print((++i)+" ");
		}
		
		for(int i : A /* A.lenght */ ){
			System.out.print((i)+" ");
		}
		

		
	}
}
