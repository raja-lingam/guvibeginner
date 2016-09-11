import java.util.Scanner;


public class Leapyear {

	
	public static void main(String[] args) {
		System.out.println("Enter the year ");
		Scanner in=new Scanner(System.in);
		int year=in.nextInt();
		if (year%4==0)
		{
			System.out.println("year is leap year");
		}
		else{
			System.out.println("not a leap year");
		}
	}

}
