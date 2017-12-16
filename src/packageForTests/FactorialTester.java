package packageForTests;

public class FactorialTester {
	
	public static void main(String[] args) {
		
		for (int i = 2; i < 13; i++) // base a
		{
			for (int j = 1; j < factorialOf(i); j++) // mod operand p
			{
				
				if (test(i, j))
				{
					//System.out.println("TRUE : " + i + " : " + j);
				}
				else
				{
					System.out.println("fls : " + i + " : " + j);
					break;
				}
				
				//System.out.println(i + " factorial = ");
				//test(i, j);
			}
			System.out.println("TRUE : " + i);
		}
	}
	
	public static boolean test(int a, int p)
	{
		if (((factorialOf(a))%p) == (factorialOfModInc(a, p)))
		{
			//System.out.println("external " + factorialOf(a) + " mod: " + p  + " = " + ((factorialOf(a))%p));
			//System.out.println("internal " + factorialOf(a) + " mod: " + p  + " = " + factorialOfModInc(a, p));
			
			return true;
		}
		//System.out.println("external " + factorialOf(a) + " mod: " + p + " = " + ((factorialOf(a))%p));
		//System.out.println("internal " + factorialOf(a) + " mod: " + p + " = " + factorialOfModInc(a, p));
		return false;
	}
	
	public static int factorialOf(int a)
	{
		int spor = 1;
		for (int i = 0; i < a; i++)
		{
			spor = spor*(a-i);
		}
		return spor;
	}
	
	public static int factorialOfModInc(int a, int p)
	{
		int spor = 1;
		for (int i = 0; i < a; i++)
		{
			spor = (spor*(a-i))%p;
		}
		return spor;
	}

}
