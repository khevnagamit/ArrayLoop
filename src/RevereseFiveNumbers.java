import java.util.Scanner;

public class RevereseFiveNumbers {
    //program to enter five digit number & revesed it
    public static void main(String[] args) {
        //printing line
        System.out.println("Enter Five digit Number");
        //creating object
        Scanner number = new Scanner(System.in);
        //Initialising & declaring variable entered by user
        int input = number.nextInt();
        //initialising variable
        int check1;
        //printing line
        System.out.println("Reversed Entered number : ");
        //repeat code until condition is true
        while (input!=0){
            //checking reminder when division by 10
            check1 = input%10;
            //printing reminder
            System.out.print( check1);
            //decreasing input integer
            input =input/10;
        }

    }
}
