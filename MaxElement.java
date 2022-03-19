
class MaxElement{

	static int Max(int A[]){
		int max=A[0];
		for(int i=1;i<A.length;i++){
			if(max<A[i]){
				max=A[i];
			}
		}
		
		return max;
	}

	public static void main(String arg[]){
		int A[]={9,12,3,4,55,6};
		System.out.println("Maximum Element from Array is: "+Max(A));
	}
}
