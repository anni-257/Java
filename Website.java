import java.util.Scanner;

class Website{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Website name: ");
		String str=sc.nextLine();
		String protocol=str.substring(0,str.indexOf(":"));
		String Website=str.substring(str.lastIndexOf("/")+1);
		String type=str.substring(str.lastIndexOf(".")+1);
		
		System.out.println("Website name: "+str);
		System.out.print("Website Protocol type: ");
		
		switch(protocol){
		
			case "http":System.out.println("Hyper Text Transfer Protocol.");
					break;
			case "https":System.out.println("Hyper Text Transfer Protocol Secure.");
					break;
			case "ftp":System.out.println("File Transfer Protocol.");
					break;
			default: System.out.println("Not Valid Protocol.");
					break;
		}
		
		System.out.print("Website Domain Type: ");
		switch(type){
			case "org":System.out.println("Organization");
					break;
			case "net":System.out.println("Network");
					break;
			case "gov":System.out.println("Government");
					break;
			case "com":System.out.println("Commercial");
					break;
			case "biz":System.out.println("Business");
					break;
			default:System.out.println("Not Valid Domain.");
					break;
		
		}
		System.out.println("Website: "+Website);
		
	}

}
