package tech_m;

public class arrayrightshift {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int last=arr[arr.length-1];
		int i;
		for(i=arr.length-1 ;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[i]=last;
		for(i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]);
	}

}
}
