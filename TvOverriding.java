
class Tv{

	public void switchOn(){System.out.println("Tv is switch On");}
	public void changeChannel(){System.out.println("Tv channel is changed");}

}

class SmartTv extends Tv{

	public void switchOn(){System.out.println("Smart Tv is switch On");}
	public void changeChannel(){System.out.println("Smart Tv channel is changed");}
	public void browse(){System.out.println("Smart Tv channel is changed");}
	
}

class Main{
	static public void main(String arg[]){
	
		Tv tv=new Tv();
		tv.switchOn();
		tv.changeChannel();
		
		SmartTv stv= new SmartTv();
		stv.switchOn();
		stv.changeChannel();
		
		Tv tv1= new SmartTv();
		tv1.switchOn();
		tv1.changeChannel();
		// tv1.browse();  error Tv reference doesn't have any browse method
		
	}
}


