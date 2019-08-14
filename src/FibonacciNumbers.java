import java.util.Scanner;

public class FibonacciNumbers {
    //program to find fibonacci Numbers
    public static void main(String[] args) {
        //printing line
        System.out.print("Fibonacci Series will show until Entered Number : ");
        //creating object
        Scanner input = new Scanner(System.in);
        //declaring initialising & instantiation variable entered by user
        int data = input.nextInt();
        //declaring initialising variable
        int num1 = 0 ;
        int num2= 0;
        int num3 =1;
        //printing line
        System.out.println("Fibonacci Series is : " );
        //code to check all numbers
        for (int i=0;i<data;i++){
            //code to check limit
           if(num2<=data) {
               //declaring & initialising temporary
               num1 = num2;
               num2 = num3;
               num3 = num1 + num2;
               //printing result
               System.out.print(num1 + " ");
           }

        }

    }
}
