
class AddCommandArg{
	public static void main(String arg[]){
		double sum=0;
		for(String x:arg){
			if(x.matches("[0-9\\.]+")){
				sum+=Double.parseDouble(x);
			}
		}
		
		System.out.println("Sum of CommandLine arguments is: "+sum); 
	}
}
