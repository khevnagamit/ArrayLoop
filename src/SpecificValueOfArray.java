import java.util.Arrays;

public class SpecificValueOfArray {
    //program to find out Specific Value of array
    public static void main(String[] args) {
        //declaring ,initialising & instantiation of variable
        int[] database = {14, 56, 89, 45, 67};
        //declaring & initialising input value
        int input = 24;
        //printing my database
        System.out.println("My Database : " + Arrays.toString(database));
        //printing my data to check in databse
        System.out.println("Data to check in my Database : "+ input);
        //declaring string
        String correct;
        //declaring & initialising string
        String ans ="No";
        //code to check all database
        for (int i=0;i<database.length;i++){
            //compare each data with input data
            if(input == database[i]){
                //after input data match with database initialising & declaring value
                ans ="yes";
            }
        }
        //initialising & declaring current value of correct
        correct = ans;
        //check value is matching
        if(correct=="yes"){
            //after match print this
            System.out.println("\n\nMy database contain : "+ input);
        }
        else {
            //not match print this
            System.out.println("\n\nMy database does not contain : "+ input);
        }
    }
}