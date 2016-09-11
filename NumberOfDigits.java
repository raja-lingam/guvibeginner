import java.util.*;
public class NumberOfDigits {

	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int number,count=0;
		number=in.nextInt();
		while(number!=0)
		{
			number=number/10;
			count++;
		}
System.out.println(count);
	}

}
