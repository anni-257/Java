class MemberOuter{
	
	class MemberInner{
		void innerDisplay(){
			System.out.println("Member Inner Display...");
		}
	}
	
	public void outerDisplay(){
		System.out.println("Member Outer Dsplay...");
		MemberInner i=new MemberInner();
		i.innerDisplay();
	}
	
}

class Main{
	public static void main(String arg[]){
		MemberOuter o=new MemberOuter();
		o.outerDisplay();
	}
}
