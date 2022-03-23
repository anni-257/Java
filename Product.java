
class Product{
	private String itemId;
	private String name;
	private int price;
	static byte qnt;
	
	// Property Methods
	
	public String getItemId(){
		return itemId;
	}
	public String getName(){
		return name;
	}
	public int getPrice(){
		return price;
	}
	public byte getQnt(){
		return qnt;
	}
	
	public void count(){
		qnt++;
	}
	
	// Constructors
	
	public Product(){
		itemId="Not Mentioned";
		name="Not Mentioned";
		price=0;
		qnt=0;
	}
	public Product(String item,String namE,int p){
		itemId=item;
		name=namE;
		price=p;
		qnt=0;
	}
}

class Shop{
	public static void main(String arg[]){
		Product item1=new Product("ABC123","Choco",500);
		Product item2=new Product("ABC1234","Biscuits",80);
		Product item3=new Product("ABC12345","Bar",10);
		System.out.println("itemId= "+item1.getItemId()+", "+item2.getItemId()+", "+item3.getItemId());
		System.out.println("itemName= "+item1.getName()+", "+item2.getName()+", "+item3.getName());
		System.out.println("itemPrice= "+item1.getPrice()+", "+item2.getPrice()+", "+item3.getPrice());
		
		
		
	}
}
