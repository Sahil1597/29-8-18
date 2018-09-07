class sub
{
	int i,j,len;
	String str1 = "xyz";
	void input()
	{

	
		len = str1.length();
		
		for (i=0;i<len;i++) 
		{
			for (j=i+1;j<=len; j++)
			{
			System.out.print(str1.substring(i,j)+" ");
			}
			System.out.println();
		}
	}
	
}

class Q2
{
	public static void main(String x[])
 	{	sub obj = new sub();
		obj.input();
	}
}
