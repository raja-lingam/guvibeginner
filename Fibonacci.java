import java.util.*;
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1;
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		n=in.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++)
		{
		int c;
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}

	}

}
