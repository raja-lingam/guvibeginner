import java.util.Scanner;
public class GCD {
public static void main(String[] args){
 int num1,num2,gcd=1;   // declaring the variables
 Scanner sc =new Scanner(System.in); // creating the scanner object to accept input 
 System.out.println("Enter the first number:");  // ask the user to enter a number
 num1=sc.nextInt(); // accept the number
 System.out.println("Enter the Second number:"); // ask the user to enter a second number
 num2=sc.nextInt(); // accept second number
 for(int i=1;i<=num1;i++){   // the loop will test until i is less than the half of the num1
 if((num1%i==0)&& (num2%i==0)){ // checking whether i divides both the numbers
  if(i>gcd)  // if i is greater than the gcd
  gcd=i;      // it will reset the value of gcd
 }
 }
 System.out.println("the Highest Common Factor is "+gcd); // will print the gcd
}
}
