
public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10000000;
		for(int i=0;i<n;i++)
		{
			if(arm(i))
			{
				
			
			System.out.println(i);
		    }
		}
	}
		public static boolean arm(int n)
		{
			
		
		//int n=152;
		int k=n;
		int len=0;
		while(k!=0)
		{
			len++;
			k=k/10;
		}
		int sum=0;
		k=n;
		while(k!=0)
		{
			int temp=k%10;
			sum+=Math.pow(temp,len);
			k/=10;
			
		}
		if(sum==n)
		{
			//System.out.println(n+" is a armstrong");
			return true;
		}
		else
		{
			//System.out.println(n+" is not a armstrong");
			return false;
		}
		
	}

}
