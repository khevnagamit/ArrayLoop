import java.util.Scanner;

public class NumberOfCharacterInString {
    //Program to find How many "a" comes in string.
    public static void main(String[] args) {
        //creating object
        Scanner data =new Scanner(System.in);
        //printing line
        System.out.print("Enter any Name to find out how many alphabet-a comes in that string :");
        //Declaring & initialising variable data enter by user
        String newdata =data.next();
        //declaring & initialising variable
        int count =0;
        //code to check each character
        for (int i=0;i<newdata.length();i++){
            //code to check character is match with a
           if (newdata.charAt(i)=='a'){
               //after match do sum
               count++;
           }
        }
        //printing result
        System.out.println("My input name has " + count + " alphabet a" );
    }
}
