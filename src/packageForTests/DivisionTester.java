package packageForTests;

public class DivisionTester {
	
	public static void main(String[] args) {
		///*
		for (double a = 3; a < 91; a++) // numerator a
		{
			for (double p = 2; p < a; p++) //mod operand
			{
				for (double b = 3; b < 91; b++) //denominator b
				{
					//System.out.println("(" + a + " / " + b + ") % " + p + " = " + QuotientOf(a, b, p));
					//System.out.println("(" + a + " % " + p + " ) " + " / (" + b + " % " + p + ")" + " = " + QuotientOfModInc(a, b, p));
					if (test(a, b, p))
					{
						//System.out.println("TRUE");
					}
					else
					{
						double spoo = (a/ b)/p;
						System.out.println("fls : " + a + " : " + b + " : " + p + "     " + spoo);
						break;
					}
				}
			}
			//System.out.println("TRUE");
		}
		//*/
		//System.out.println(test(7, 4, 2));
	}
	
	public static boolean test(double a, double b, double p)
	{
		if ((QuotientOf(a, b, p)) == (QuotientOfModInc(a, b, p)))
		{
			return true;
		}
		return false;
	}
	
	public static double QuotientOf(double a, double b, double p)
	{
		double spor = (a/b) %p;
		return Math.floor(spor);
	}
	
	public static double QuotientOfModInc(double a, double b, double p)
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
