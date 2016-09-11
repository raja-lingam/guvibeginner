import java.util.*;
public class Largest {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter three number");
		int a,b,c;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(a +"is greater");
		}
		else if(b>c)
		{
			System.out.println(b +"is greater");
		}
		else if(c>b)
		{
			System.out.println(c +"is greater");
		}

	}

}
