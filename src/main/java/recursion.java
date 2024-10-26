
public class recursion {

	public static void main(String[] args) {
		
		System.out.println(exe5(10,3));
		

	}
	public static double f(double n)

	{
		if (n==1)
		{
			return 1;
		}
		return (n*f(n-1));
	}
	
	public static double e(double n)
	{
		if (n==0)
		{
			return 1;
		}
		return 1/f(n) + e(n-1);
	}

	public static int exe1 (int n)
	{
		if (n==1)
			return 1;
		
		return n+exe1(n-1);
	}

	public static int exe2 (int n)
	{
		if (n==1)
		{
			return 1;
		}
		return (n*exe2(n-1));
	}
	
	public static int exe3 (int n)
	{
		if (n==1)
		{
			return 1;
		}
		if (n%2==0)
		{
			n-=1;
		}
		
		return n*exe3(n-2);
		
	}

	public static int exe4 (int n)
	{
		if (n == 0 )
		{
			return 0;
		}
		
		return 1+exe4(n/10);
	}
	
	public static int exe5 (int n1, int n2)
	{
		if (n1==0 || n2 == 0 || n1 < n2)
		{
			return 0;
		}
		
		return 1+exe5(n1-n2, n2);
		
	}
	
	public static int exe6 (int n1, int n2)
	{

		if (n1==0 || n2 == 0)
		{
			return 0;
		}
		
		if (n1 >= n2)
		{
			return exe6(n1-n2,n2);
		}
		return n1;
	}
	
	public static boolean exe7 (int x, int y)
	{
		if (x == 0 || y == 0)
		{
			return true;
		}
		if (y>x)
		{
			return false;
		}
		
		return exe7(x-y, y);
	}
	
	public static boolean exe8 (int n, int i)
	{
		// at first, i is equal to n-1
		
		if (n == 0  || i == 0) 
		{
			return false;
		}
		if (i == 1)
		{
			return true;
		}
		
		if (n%i == 0 )
		{
			return false;
		}
		return exe8(n, i-1);
		
	}
	
	public static boolean exe9 (int n)
		{
			if ( n == 0)
			{
				return true;
			}
			if (n%2 != 0)
			{
				return false;
			}
			return exe9(n/10);
		}

}
