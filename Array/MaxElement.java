
class MaxElement{
	public static void main(String arg[]){
		int arr[]={1,2222,12,33,2,3333,34,45,5555};
		System.out.print("Max Element: ");
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
	}
}
