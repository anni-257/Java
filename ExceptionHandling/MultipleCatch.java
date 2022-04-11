
class MultipleCatch{

	public static void main(String args[]){
		try{
			int a[]={10,0,223,44,55,23};
			
			System.out.println(">>>>>>>>>>>");
			int c=a[0]/a[2];
			System.out.println("<<<<<<<<<<<"+c);
			System.out.println(a[10]);
			System.out.println("~~~~~~~~~~~");
			
		
		}
		catch(ArithmeticException e){
			System.out.println("Zero Exception: "+e);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		finally{
			System.out.println("Finally");
		}
	
	}
}
