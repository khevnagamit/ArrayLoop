import java.util.Scanner;

public class OddEvenSumBoth {
    //Program to input 5 Digit Numbers & do Sum of odds & even each number
    public static void main(String[] args) {
        //printing line
        System.out.print("Enter Five Digit Number :");
        //creating object
        Scanner digit =new Scanner(System.in);
        //declaring & initialising variable entered by user
        int data = digit.nextInt();
        //declaring variables
        int check1;
        int check2;
        int check3;
        //declaring & initialising variable
        int sum1 =0;
        int sum2=0;
        //repeat program until condition fail
        while(data !=0){
            //temp checking reminder with division 10
            check1 =data%10;
            //temp declare & initialise variable
            check2 = check1;
            //temp checking reminder with division 2
            check3 = check2%2;
            //check temp check 3 reminder
            if(check3==0){
                //after find reminder =o add it
                sum1 +=check2;
            }
            else {
                //after finding reminder is not 0 add it
                sum2 += check2;
            }
            //decreasing integer
            data =data/10;
        }
        //printing result
        System.out.println("Total of Entered Even Digit is : " +sum1 );
        System.out.println("Total of Entered Odd Digit is : " + sum2);
    }
}

