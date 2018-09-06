package scripts;

public class Example4 {
	
	public static void amstrongNumber()	{
		int Num = 153;
		int sum = 0;
		int rem;
		int temp = Num;
		while (Num != 0)	{
			rem = Num % 10;
			sum = sum + rem*rem*rem;
			Num = Num / 10;
			
		}
		if (temp==sum)	{
			System.out.println(temp + " is an amstrong number");
		}
		else	{
			System.out.println(temp + " is not an amstrong number");
		}
		System.out.println("-----------------------------");
		amstrongNumbers();
	}
	
	public static void amstrongNumbers()	{
		int sum = 0;
		int r;
		for (int N=1; N<500; N++)	{
			int temp = N;
			while (temp > 0)	{
				r = temp % 10;
				sum = sum + r*r*r;
				temp = temp / 10;
			}
			if (sum==N)	{
				System.out.println(N);
			}
			sum=0;
		}
	}

}
