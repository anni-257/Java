
import java.util.Scanner;

class Student{
	private String name;
	private String rollNo;
	private static int cnt=40;
	private final String div="SE- A";
	private final static String clg="D.Y.Patil Institute of Engineering, Management and Research";
	
	public Student(String name){
		this.name=name;
	}
	
	private String assignRollNo(){
		String str;
		if(cnt<10)
			str="SACO2010"+cnt;
		else
			str="SACO201"+cnt;
		
		cnt++;
		return str;
	}
	public void setRollNo(){
		rollNo=assignRollNo();
	}
	public void getInfo(){
		System.out.println("----> Student Information <----\n");
		System.out.println("Name: "+name);
		System.out.println("Div: "+div);
		System.out.println("Roll Number: "+rollNo);
		System.out.println("College Name: "+clg);
		System.out.println();
		
	}
	
}
	
class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		Student st[]=new Student[5];
		
		for(int i=0;i<5;i++){
			System.out.print("Enter Student Name: ");
			st[i]=new Student(sc.nextLine());
			st[i].setRollNo();
		}
		
		for(int i=0;i<5;i++){
			st[i].getInfo();
		}
		
		sc.close();
	}
}
	
	
