package packageForTests;

public class Tester {
	//testing whether (a^k)%p = (a%p)^k
	public static void main(String[] args) {
		for (int i = 3; i < 29; i++) // base a
		{
			for (int j = 2; j < 5; j++) // exponent k
			{
				for (int k = 1; k < 28; k++) // prime p
				{
					if (test(i, j, k))
					{
						System.out.println("TRUE : " + i + " : " + j + " : " + k);
					}
					else
					{
						System.out.println("fls : " + i + " : " + j + " : " + k);
					}
				}
			}
		}
	}
	
	public static boolean test(int a,int k, int p)
	{
		if (((powerOf(a, k))%p) == (powerOfModInc(a, k, p)))
		{
			return true;
		}
		return false;
	}
	
	public static int powerOf(int a,int k)
	{
		int spor = 1;
		for (int i = 0; i < k; i++)
		{
			spor = spor*a;
		}
		return spor;
	}
	
	public static int powerOfModInc(int a,int k, int p)
	{
		int spor = 1;
		for (int i = 0; i < k; i++)
		{
			spor = (spor*a)%p;
		}
		return spor;
	}

}
