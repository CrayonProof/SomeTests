package packageForTests;

public class DivisionTester {
	
	public static void main(String[] args) {
		/*
		for (int a = 2; a < 91; a++) // numerator a
		{
			for (int b = 2; b < 91; b++) // denominator b
			{
				for (int p = 2; p < (a/b); p++) //mod operand
				{
					System.out.println("(" + a + " / " + b + ") % " + p + " = " + QuotientOf(a, b, p));
					//System.out.println("(" + a + " % " + p + " ) " + " / (" + b + " % " + p + ")" + " = " + QuotientOfModInc(a, b, p));
					if (test(a, b, p))
					{
						System.out.println("TRUE");
					}
					else
					{
						System.out.println("fls");
					}
				}
			}
		}
		*/
		System.out.println(test(8, 4, 3));
	}
	
	public static boolean test(int a, int b, int p)
	{
		if ((QuotientOf(a, b, p)) == (QuotientOfModInc(a, b, p)))
		{
			return true;
		}
		return false;
	}
	
	public static double QuotientOf(int a, int b, int p)
	{
		double spor = (a/b) %p;
		return Math.floor(spor);
	}
	
	public static double QuotientOfModInc(int a, int b, int p)
	{
		double spor = (a%p) / (b%p);
		return Math.floor(spor);
	}

}
