
class Phone{

	public void call(){System.out.println("Phone Calling...");}
	public void sms(){System.out.println("Phone Sending SMS...");}

}

interface ICamera{

	void click();
	void record();
}

interface IMusic{

	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera,IMusic{
	
	public void videoCall(){System.out.println("SmartPhone Making Video call...");}
	public void click(){System.out.println("SmartPhone Clicking Photo...");}
	public void record(){System.out.println("SmartPhone Recording Video...");}
	public void play(){System.out.println("SmartPhone Playing Music...");}
	public void stop(){System.out.println("SmartPhone Stopped Playing Music...");}
	
}

class Main{
	
	public static void main(String arg[]){
		System.out.println("----SmartPhone Reference & Object----");
		SmartPhone sp=new SmartPhone();
		sp.call();
		sp.sms();
		sp.click();
		sp.record();
		sp.play();
		sp.stop();
		
		System.out.println("----Phone Reference & SmartPhone Object----");
		Phone p=new SmartPhone();
		p.call();
		p.sms();
		//p.click();
		//p.record();
		//p.play();
		//p.stop();
		
		System.out.println("----Icamera Reference & SmartPhone Object----");
		ICamera c=new SmartPhone();
		//c.call();
		//c.sms();
		c.click();
		c.record();
		//c.play();
		//c.stop();
		
		System.out.println("----Imusic Reference & SmartPhone Object----");
		 IMusic m=new SmartPhone();
		//m.call();
		//m.sms();
		//m.click();
		//m.record();
		m.play();
		m.stop();
		
		
	}
}
