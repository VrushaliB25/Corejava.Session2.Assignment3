
public class Session2Assignment3 {
	public static void main(String s[])
	{
		int a=190, b=290, c=40;
		if (a>b & a>c)
			System.out.println("The highest among the three numbers "+a+" ,"+b+" and "+c+" is "+a);
	else
		if (b>a & b>c)
			System.out.println("The highest among the three numbers "+a+" ,"+b+" and "+c+" is "+b);
			else
				if (c>a & c>b)
					System.out.println("The highest among the three numbers "+a+" ,"+b+" and "+c+" is "+c);
				else
					System.out.println("no number is highest. ");
					
	}

}
