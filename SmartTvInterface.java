
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
	public void stop(){System.out.println("SmartPhone stopped playing music
}
