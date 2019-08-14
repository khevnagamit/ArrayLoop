import java.util.Scanner;

public class TablesForGivenNumber {
    //Program to find out table of entered number
    public static void main(String[] args) {
        //printing line
        System.out.print("Enter Number for it's table:");
        //creating object
        Scanner input = new Scanner(System.in);
        //declared & initialising variable entered by user
        int data =input.nextInt();
        //code to do with each data
        for(int i=1;i<=10;i++){
            //printing result
            System.out.println(data + " X "+ i + " = "+ (data*i));
        }
    }
}
