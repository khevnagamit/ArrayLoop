import java.util.Scanner;

public class CountSpaceWord {
    //program to count space & Words from sentence
    public static void main(String[] args) {
        //creating object
        Scanner line = new Scanner(System.in);
        //printing line
        System.out.print("Enter any Sentence: ");
        //Declaring initialisation & instantiation of variable given by user
        char enter[] = line.nextLine().toCharArray();
        //Declaring & initialisation of variable in integer
        int space =0;
        int word =0;
        //code to check all string
        for(int i=0;i< enter.length;i++){
            //code to find space character
            if ( Character.isSpaceChar(enter[i])){
                //after find add it
                space++;
            }
        }
        //two string have 1 space so adding 1 in total space
        word =space+1;
        //printing result
        System.out.println("In this sentence Spaces used: " + space + " times & Words used: "+ word +" times");
    }
}
