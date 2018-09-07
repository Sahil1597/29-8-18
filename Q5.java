import java.util.*;
class count
{
	Scanner sc = new Scanner(System.in);
	
	String str ;
	
	int c = 1;
	
	void input()
	{
	System.out.println("Enter the String");	
	str = sc.nextLine();	
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
			c++;	
		}
	}
	
	void output()
	{
	System.out.println("Total Number of Words are "+c);
	}
}

class Q5
{
	public static void main(String x[])
	{
	count obj = new count();
	obj.input();
	obj.output();
	}
}