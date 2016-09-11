import java.util.*;
public class Natural 
{
    public static void main(String args[])
    {
        int f;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
         f= s.nextInt();
        for(int i=1;i<=f;i++)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+f+" numbers is :"+sum);
    } 
}
