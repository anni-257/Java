
class VariableArgs{

	static void args(int ... x){
		
	
		for(int a:x){
			System.out.print(a+" ");
		}
		System.out.println("Size of arguments: "+x.length);
	}
	
	public static void main(String arg[]){
		
		// calling to Variable args method
		
		args();
		args(10,20,30);
		args(10,20,30,40,50);
		
		
		
		
		
	}
}
