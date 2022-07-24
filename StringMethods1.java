

class StringMethods1{

	public static void main(String arg[]){
		String str="java";
		int len=str.length();
		str =str.toUpperCase();
		System.out.println("length= "+len+" UpperCase= "+str);
		str=str.toLowerCase();
		System.out.println("LowerCase= "+str);
		
		String trim="---------Hello Aniket---------";
		len=trim.length();
		System.out.println("Before trim= "+trim);
		trim=trim.trim();
		int len1=trim.length();
		System.out.println("After trim= "+trim);
		System.out.println("len1= "+len+" len2= "+len1);
		
	}
}
