import java.util.Scanner;

public class FiveDigitNumberWithSum {
    //Program to input 5 Digit Numbers & do Sum of each number
    public static void main(String[] args) {
        //printing line
        System.out.print("Enter Five Digit Number :");
        //creating object
        Scanner input = new Scanner(System.in);
        //initialising sum
        int sum =0;
        // initialising & declaring data entered by user
        int data =input.nextInt();
        //code to do sum with each number
        while (data !=0){
            //code for sum & add reminder
            sum += data%10;
            //code for division of data with 10 so every time number will shorter every time
            data = data/10;
        }
        //printing result
            System.out.println("Total of Entered Digit is : " + sum);
    }
}
