class Car{
	public void start(){System.out.println("Car Start...");}
	public void accelerate(){System.out.println("Accelerate Car...");}
	public void changeGear(){System.out.println("Manually Gear Changed...");}
}

class LuxaryCar extends Car{
	public void changeGear(){System.out.println("Auto Gear Changed...");}
	public void openRoof(){System.out.println("Roof Opened...");}
}

class Main{

static public void main(String arg[]){
	System.out.println("---- Car Object----");
	Car c=new Car();
	c.start();
	c.accelerate();
	c.changeGear();
	
	System.out.println("---- LuxaryCar Object----");
	LuxaryCar lc=new LuxaryCar();
	lc.start();
	lc.accelerate();
	lc.changeGear();
	lc.openRoof();
	
	System.out.println("---- Reference from Car & Object from LuxaryCar----");
	Car c1= new LuxaryCar();
	c1.start();
	c1.accelerate(); 
	c1.changeGear(); // LuxaryCar Method
	// c1.openRoof(); cannot call bcz of Car reference 
}

}
