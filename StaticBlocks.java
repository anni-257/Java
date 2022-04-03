class StaticBlock{
	static {
		System.out.println("Block 3");
	}
	
	public void display(){
		System.out.println("StaticBlocks End");
	}
	
	static{
		System.out.println("Block 4");
	}
}

class Main{
	static{
		System.out.println("Block 1");
	}
	
	public static void main(String arg[]){
	
		System.out.println("Main class");
		StaticBlock sb=new StaticBlock(); 
		sb.display();
	
	}
	
	static{
		System.out.println("Block 2");
	}
}
