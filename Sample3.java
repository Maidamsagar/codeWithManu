
public class Sample3 {

	public static void main(String[] args) {
		int n=100;
		System.out.println(rec(n));
	}
//	public static int rec(int value)
//	{
//		if(value!=0)
//		{
//			return value+rec(value-1);
//		}
//		else
//		{
//			return 1;
//		}
//	}
	public static int rec(int value)
	{
	 int n=value*2-1;
	  if(n>0)
	  {
		  return n+rec(value-1);
	  }
	  else
	  {
		  return 0;
	  }
	}

}
