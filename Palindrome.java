import java.util.*;
public class Palindrome {

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int number;
		number=in.nextInt();
		int n=number;
		int result=0;
		int pali;
		while(n!=0)
		{
			pali=n%10;
			result=pali+result*10;
			n=n/10;
			
		}
		if(number==result)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not  palindrome");
		}

	}

}
