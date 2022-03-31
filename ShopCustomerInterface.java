
interface Member{
	void callback();
}

class Store{
	Member Members[]=new Member[10];
	int cnt=0;
	
	Store(){
		System.out.println("Welcome to store...");
	}
	
	public void register(Member m){
		Members[cnt++]=m;
	}
	
	void inviteSale(){
		for(int i=0;i<cnt;i++){
			Members[i].callback();
		}
	}
	
	
}

class Customer implements Member{
	String name;
	
	Customer(String n){
		name=n;
	}
	public void callback(){
		System.out.println("Okay, I will visit, "+name);
	}
}

class Main{
	public static void main(String arg[]){
		Store s=new Store();
		Customer c1=new Customer("Aniket");
		Customer c2=new Customer("Achal");
		
		s.register(c1);
		s.register(c2);
		s.inviteSale();
	}
}
