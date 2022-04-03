import java.util.Scanner;
class HondaCity{
	static double price =1000000;
	int a,b;
	
	static double onRoadPrice(String city){
		switch(city){
			case "Delhi": return price+price*0.1;
			case "Mumbai": return price+price*0.09;
			case "Pune": return price+price*0.08; 
		}
		
		return price;
	}
}

class Main{
	public static void main(String arg[]){
		HondaCity h1=new HondaCity();
		HondaCity h2=new HondaCity();
		System.out.println("Price of HondaCity Car: "+HondaCity.price);
		System.out.println("Price of HondaCity Car on road for Delhi, Pune, Mumbai resp. is "+HondaCity.onRoadPrice("Delhi")+", "+h1.onRoadPrice("Pune")+", "+h2.onRoadPrice("Mumbai"));
	}
}
