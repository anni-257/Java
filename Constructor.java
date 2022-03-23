
class Student{
	private int rollNo;
	private String name;
	private String year;
	
	public Student(){
		rollNo=0;
		name="Name is not mentioned";
		year="Year is not mentioned";
	}
	public Student(int R,String N,String Y){
		rollNo=R;
		name=N;
		year=Y;
	}
	
	public int getRoll(){
		return rollNo;
	}
	public String getName(){
		return name;
	}
	public String getYear(){
		return year;
	}
}
class Constructor{

	public static void main(String arg[]){
		Student s1=new Student();
		Student s2=new Student(20144,"Aniket","2nd Year");
		System.out.println("---Student 1 Information---");
		System.out.println("Name: "+s1.getName());
		System.out.println("roll No: "+s1.getRoll());
		System.out.println("year: "+s1.getYear());
		System.out.println("\n---Student 2 Information---");
		System.out.println("Name: "+s2.getName());
		System.out.println("roll No: "+s2.getRoll());
		System.out.println("year: "+s2.getYear());
		
	}
	
}
