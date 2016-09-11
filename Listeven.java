import java.util.*;
public class Listeven {
 
        public static void main(String[] args) {
               
                //define the limit
                int l;
                
               Scanner in=new Scanner(System.in);
               l=nextInt();
                System.out.println("Printing Odd numbers between 1 and " + limit);
               
                for(int i=1; i <= l; i++){
                       
                        //if the number is not divisible by 2 then it is odd
                        if( (i % 2) == 0)
                        {
                                System.out.print(i + " ");
                        }
                }
        }
}
