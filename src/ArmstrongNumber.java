import java.util.Scanner;

public class ArmstrongNumber {
    //Program to find out given number is Armstrong Number
    public static void main(String[] args) {
        //Printing line
        System.out.print("Enter any Number : ");
        //creating object
        Scanner check = new Scanner(System.in);
        //declaring & initialising of variable given number by user
        int input = check.nextInt();
        //declaring & initialising of variable
        int temp = 0;
        int num = 0;
        int cube =0;
        //giving variable value which is given by user
        temp = input;
        while ( temp !=0){
            //code for reminder value
            num = temp%10;
            //cube value & add cube of reminder number
            cube =cube + num*num*num;
            //current temp value divided by 10 so it will shorter number every time
            temp /=10;
        }

        if ( cube == input){
            //Loop's total will match with input print below statement
            System.out.println( input+ " Number is Armstrong Number");
        }
        else {
            //Loop's total will not match with input print below statement
            System.out.println( input + "Number is not Armstrong Number");
        }
    }

}
