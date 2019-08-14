import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        //declaring ,initialising & instantiation of variable
        int value[]={10,20,40,50,60};
        //Printing my array data
        System.out.println("My Actual data :" + Arrays.toString(value));
        //initialising which index number
        int indexnum = 2;
        //initialising value to input
        int newValue = 30;
        //code to change index number
        for(int i=value.length-1;i>indexnum;i--) {
            //giving to all data new index number
            value[i] = value[i - 1];
        }
            //inserting at given index number with new value
            value[indexnum]= newValue;
        //printing after inserting data
            System.out.println("My Data with inserted element is : " + Arrays.toString(value));


    }
}
