

abstract class Hospital{
	void Hospital(){
		System.out.println("Hospital is a Abstract Class");
	}
	
	abstract public void emergency();
	abstract public void appointment();
	abstract public void admit();
	abstract public void billing();
}

class MyHospital extends Hospital{

	public void emergency(){ System.out.println("Emergency Ward is available");}
	public void appointment(){ System.out.println("Appointment ...");}
	public void admit(){System.out.println("Admit ...");}
	public void billing(){System.out.println("Billing is available");}
	
}

class AbstractClass {
	public static void main(String arg[]){
	
		Hospital xyz=new MyHospital();
		xyz.emergency();
		xyz.appointment();
		xyz.admit();
		xyz.billing();
		
	}
}


