
public class Sample1 {
	public static void main(String args[])
	{
		int arr1[]= {200,300,5000000,9999999};
		int arr2[]= {1,3,5};
		int temp[]=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr1[i]>arr2[j])
			{
				temp[k++]=arr2[j++];
			}
			else
			{
				temp[k++]=arr1[i++];
			}
		}
		while(i<arr1.length)
		{
			temp[k++]=arr1[i++];
					
		}
		while(j<arr2.length)
		{
			temp[k++]=arr2[j++];
					
		}
		for(int element:temp)
		{
			System.out.print(element+" ");
		}
		
	}

}
