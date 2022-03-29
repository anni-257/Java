
abstract class KFC{
	public KFC(){
		System.out.println("Instructions for the all Franchise");
	}
	
	public void MakeItem(){
		System.out.println("Menu Making tips/receipe");
	}
	
	abstract public void billing();
	abstract public void offer();
}

class Mykfc extends KFC{
	public Mykfc(){System.out.println("This is My KFC ..");}
	public void billing(){System.out.println("Billing... ");}
	public void offer(){System.out.println("offer ...");}
	void festvalOffer(){System.out.println("Festival offers...");}
}

class Test{
	public static void main(String arg[]){
		KFC franchise1=new Mykfc();
		franchise1.billing();
		franchise1.offer();
		// franchise1.festvalOffer(); Error 
	
	}
}
