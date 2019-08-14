import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

public class PalindromeNumber {
    //Program to find out given number is Palindrome
    public static void main(String[] args) {
        //printing line
        System.out.print("Enter any Number :");
        //creating object
        Scanner number = new Scanner(System.in);
        //declaring & initialising variable data entered by user
        int input = number.nextInt();
        //declaring & initialising variable
        int sum = 0,extra;
        int temp = input ;
        //code to repeat
        while (input >0){
            //find out reminder
            extra = input%10;
            //by multiply last digit with 10 & adding up with reminder will help to check reversed
            sum = (sum * 10)+extra;
            //current temp value divided by 10 so it will shorter number every time
            input =input/10;
        }
        //code to check palindrome number
        if (temp == sum){
            //condition match print this line
            System.out.println(temp + " is Palindrome Number");
        }
        else{
            //condition not match print this line
            System.out.println(temp + " is not Palindrome Number");
        }
    }
}
