import java.util.Arrays;

public class SumOfArray {
    //program to find out sum of array
    public static void main(String[] args) {
        //Declaring initialisation & instantiation of variable
        int value[]={12,45,75,83,35};//can change value here
        //Declaring Addition
        int add =value[0]+value[1]+value[2]+value[3]+value[4];
        //print out actual data
        System.out.println("My Actual data are :"+ Arrays.toString(value));
        //print out sum of my array
        System.out.println("Sum of my actual data is = "+ value[0]+ " + "+ value[1] + " + " +value[2]+ " + "+ value[3]+ " + "+value[4] + " = "+add);


    }

}
