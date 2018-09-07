import java.util.*;
class reverse
{
	Scanner sc = new Scanner(System.in);
	int i,j,len;
	String k = "";
	String str1;
	void input()
	{
		System.out.println("Enter the string");
		String str = sc.nextLine();
	
		j = str.length();
		for(i=j-1;i>=0;i--)
		{
		k = k + str.charAt(i); 		
		}
	}
	
	void output()
	{
	System.out.println("Reverse is "+k);
	}
}

class Q1
{
	public static void main(String x[])
 	{	reverse obj = new reverse();
		obj.input();
		obj.output();
	}
}