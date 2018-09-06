package scripts;

public class Example3 {
	
	public static void main(String[] args) {
		int n = 1564;
		int rev = 0;
		int rem;
		while (n > 0)	{
			rem = n % 10;
			rev = rev*10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
		System.out.println("--------------------");
		Example3 exam = new Example3();
		exam.numberPalindrome(12321);
		System.out.println("---------------------");
		exam.stringPalindrome();
		reverseString();
		System.out.println("**********************");
		Example4.amstrongNumber();
	}
	
	public void numberPalindrome(int num)	{
		int rev = 0;
		int rem;
		int temp = num;
		while (temp > 0)	{
			rem = temp % 10;
			rev = rev*10 + rem;
			temp = temp / 10;
		}
		if (num==rev)	{
			System.out.println(num + " is an palindrome");
		}
		else	{
			System.out.println(num + " is not an palindrome");
		}
	}
	
	public void stringPalindrome()	{
		String s = new String("MADAM");
		int j = s.length()-1;
		int count = 0;
		for (int i=0; i<s.length(); i++)	{
			if (s.charAt(i)==s.charAt(j--))	{
				count++;
			}
		}
		if (count==s.length())	{
			System.out.println(s + " is palindrome");
		}
		else	{
			System.out.println(s + " is not an palindrome");
		}
	}
	
	public static void reverseString()	{
		System.out.println("----------------------");
		String s = "Vinayak";
		int size = s.length()-1;
		String reverse = " ";
		for (int i=size; i>=0; i--)	{
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
	}

}
