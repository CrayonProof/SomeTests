package packageForTests;

public class DivisionTester {
	
	public static void main(String[] args) {
		///*
		for (int a = 3; a < 91; a++) // numerator a
		{
			for (int p = 2; p < a; p++) //mod operand
			{
				for (int b = 3; b < 91; b++) //denominator b
				{
					//System.out.println("(" + a + " / " + b + ") % " + p + " = " + QuotientOf(a, b, p));
					//System.out.println("(" + a + " % " + p + " ) " + " / (" + b + " % " + p + ")" + " = " + QuotientOfModInc(a, b, p));
					if (test(a, b, p))
					{
						//System.out.println("TRUE");
					}
					else
					{
						System.out.println("fls : " + a + " : " + b + " : " + p);
						break;
					}
				}
			}
			//System.out.println("TRUE");
		}
		//*/
		//System.out.println(test(7, 4, 2));
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
		if (!(((a%p) == 0) || ((b%p) == 0)))
		{
			double spor = (a%p) / (b%p);
			return Math.floor(spor);
		}
		else
		{
			return QuotientOf( a, b, p);
		}
		
	}

}
