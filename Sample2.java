
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'s','a','g','a','r'};
		char temp;
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;	
		}
	  for(char element:arr)
	  {
		  System.out.println(element);
	  }

	}

}
