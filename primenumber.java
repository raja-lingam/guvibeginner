import java.util.Scanner;
public class primenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int flag=0;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0){
				flag=flag+1;
			}
		}
		
		if(flag==1)
		{
			System.out.println("number is prime");
			// TODO Auto-generated method stub
		}
		else
		{
			System.out.println("number is not prime");
		}

	}

}
