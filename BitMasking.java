import java.lang.*;

import java.util.Scanner;

class Masking{
	int pos,num,res,bitMask;
	Scanner sc;
	
	void scan(){
		sc=new Scanner(System.in);
	}
	
	void get(){
	
		System.out.println("Get bit");
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		System.out.print("Enter position");
		pos=sc.nextInt();
		bitMask=1<<pos;
		
		res=bitMask&num;
		System.out.println("Position "+pos+" = "+" bit "+Integer.toBinaryString(res));
	
	}
	void set(){
	
		System.out.println("Set Bit to 1");
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		System.out.print("Enter position: ");
		pos=sc.nextInt();
		bitMask=1<<pos;
		
		res=bitMask|num;
		
		System.out.println("before set bit: "+Integer.toBinaryString(num)+"\nAfter set bit: "+Integer.toBinaryString(res)+"\n");
		
		}
	void clear(){
		
		System.out.println("Set Bit to 0");
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		System.out.print("Enter position: ");
		pos=sc.nextInt();
		bitMask=1<<pos;
		
		res=((~bitMask) & num);
		
		System.out.println("before set bit: "+Integer.toBinaryString(num)+"\nAfter set bit: "+Integer.toBinaryString(res)+"\n");
		
		
	}
	
}

class BitMasking{
	public static void main(String arg[]){
		int choice;
		Scanner sc=new Scanner(System.in);
		Masking obj=new Masking();
		obj.scan();
		
		do{
			System.out.println("----- Enter Following choice -----\n1.Get Bit\n2.Set Bit\n3.Clear Bit\n4.Exit..!!");
			choice=sc.nextInt();
			switch(choice){
			case 1:obj.get(); break;
			case 2:obj.set(); break;
			case 3:obj.clear(); break;
			case 4: System.out.println("Exiting..."); break;
			default: System.out.println("Please Enter appropriate choice"); break;
			}
			
		}while(choice!=4);	
		
		
	}
}
