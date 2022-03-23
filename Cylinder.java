
class Cylinder{
	private double radius;
	private double height;
	
	public Cylinder(){
		radius=0;
		height=0;
	}
	public Cylinder(double r){
		radius=r;
		height=1;
	}
	public Cylinder(double r, double h){
		radius=r;
		height=h;
	}
	
	public void setRadius(int r){
		radius=r;
	}
	public void setHeight(int h){
		height=h;
	}
	public double getRadius(){
		return radius;
	}
	public double getHeight(){
		return height;
	}
	
	public void setDiamention(int r, int h){
		radius=r;
		height=h;
	}
}
class Main{
	public static void main(String arg[]){
		Cylinder c =new Cylinder();
		c.setRadius(5);
		System.out.println("Radius of Cylinder is: "+ c.getRadius());
		c.setHeight(10);
		System.out.println("Height of Cylinder is: "+ c.getHeight());
		c.setDiamention(10,20);
		System.out.println("Radius of Cylinder is: "+ c.getRadius());
		System.out.println("Height of Cylinder is: "+ c.getHeight());
		
		
	}
}
