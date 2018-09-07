import java.util.*;
class remove
{
	Scanner sc = new Scanner(System.in);
	int i,j,len;
	String str;
	String str2 = "";
	void input()
	{
		System.out.println("Enter the String ");
		str = sc.nextLine();
	
		len = str.length();
		
		for (i=0;i<len;i++) 
		{
			if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U')
			str2 = str2 + str.charAt(i);
		}
	}
	
	void output()
	{
	System.out.println(str2);
	}
	
}

class Q3
{
	public static void main(String x[])
 	{	remove obj = new remove();
		obj.input();
		obj.output();
	}
}
