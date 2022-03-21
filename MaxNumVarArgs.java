
class MaxNumVarArgs{

	static int Max(int ...A){
		if(A.length==0) return Integer.MIN_VALUE;
		else{
			int max=A[0];
			for(int x:A){
				if(max<x){
					max=x;
				}
			}
			
			return max;
		}
	}
	public static void main(String arg[]){
		System.out.println("Max Element: "+Max());
		System.out.println("Max Element: "+Max(1,2,12,15,20,4,5,3));
	}
}
