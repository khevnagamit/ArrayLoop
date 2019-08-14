import java.util.Scanner;

public class NaturalNumberAddition {
    //program to find addition of n numbers & n given by user
    public static void main(String[] args) {
        System.out.print("To Find sum of Natural Number Enter Number : ");
        //creating object
        Scanner num = new Scanner(System.in);
        //Declaring , Initialising variable Entered by user
        int input = num.nextInt();
        int num1 =0;
        int num2 =1;
        int num3 =0;
        System.out.println("\nThe first n natural numbers are ");
        //code to repeat condition
        for(int i=1; i<=input;i++){
            //temporary value
            num1=num3;
            num2=i;
            num3=num2+num1;
            System.out.print(i +" " );
        }
        //initialising & declaring current value of sum
        int sum = num3;
        //printing result
        System.out.println("\nSum of natural Number up to " +input+ " is : " +sum);
    }
}