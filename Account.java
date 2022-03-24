
class Account{
	private long accNo;
	private String name;
	private String address;
	private String dob;
	protected long balance;
	protected long loanAmt;
	private String phNo;
	
	// Constructor
	public Account(){};
	public Account(long acc,String name,String add,String dob,long bal,long loanAmt,String phNo){
		accNo=acc;
		this.name=name;
		address=add;
		this.dob=dob;
		balance=bal;
		this.loanAmt=loanAmt;
		this.phNo=phNo;
	}
	
	// getter
	
	public long getAccNo(){
		return accNo;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getDob(){
		return dob;
	}
	public long getBalance(){
		return balance;
	}
	public String getPhNo(){
		return phNo;
	}
	
	// Setter
	
	public void setAddress(String add){
		address=add;
	}
	public void setPhNo(String num){
		phNo=num;
	}
	
}

class SavingAcc extends Account{
	public SavingAcc(long acc,String name,String add,String dob,long bal,long loanAmt,String phNo){
		super(acc,name,add,dob,bal,loanAmt,phNo);
	}
	public void deposit(long amt){
		balance+=amt;
	}
	
	public void withdraw(long amt){
		balance-=amt;
	}
}

class LoanAcc extends Account{
	
	public long getloanAmt(){
		return loanAmt;
	}
	public void payEMI(long amt){
		loanAmt-=amt;
	}
	public void rePay(long amt){
		if(loanAmt==amt){
			loanAmt=0;
		}
	}
	
}

class Main{
	public static void main(String arg[]){
		SavingAcc cust1=new SavingAcc(123456789l,"Aniket","Pune","07/02/2001",1400l,0l,"8378914234");
		System.out.println("Name: "+cust1.getName()+"\n"+"Available Balance: "+cust1.getBalance());
		cust1.deposit(200);
		System.out.println("After Deposit 200/- : ");
		System.out.println("Name: "+cust1.getName()+"\n"+"Available Balance: "+cust1.getBalance());
		System.out.println("After Withdrawing 400/- :");
		cust1.withdraw(400);
		System.out.println("Name: "+cust1.getName()+"\n"+"Available Balance: "+cust1.getBalance());
	}
}
