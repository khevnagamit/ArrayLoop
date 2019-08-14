import java.util.Arrays;

public class IndexOfArray {
    //program to find out index of array element
    public static void main(String[] args) {
        //Declaring initialisation & instantiation of variable in integer
        int database[]={50,30,80,20,70,60};
        //Printing all data
        System.out.println(Arrays.toString(database));

        int input = 80;//please input valid numbers
        //printing array for which index should find
        System.out.println( " My input number is : " + input);
        //code to find input data in array one by one
        for(int i =0 ; i<6; i++ ){
            //code to check input is matching with database
            if(input== database[i]){
                //after finding input printing index number of code
                System.out.println("Indext number of input number is : " + i);
            }


        }
    }
}
