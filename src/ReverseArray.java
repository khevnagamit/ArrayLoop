import java.util.Arrays;

public class ReverseArray {
    //program to reverse array
    public static void main(String[] args) {
        //Declaring initialisation & instantiation of variable in integer
        int data[]={10,15,20,25,30,35};
        //printing my actual data in array
        System.out.println("Actual Data are : "+ Arrays.toString(data));
        //code to make reversed
        for (int i=0; i<data.length/2;i++) {
            //initialising temporary to do interchange
            int swap = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = swap;
        }
        //after reversing Printing out Reversed data
        System.out.println("Reversed data are : "+Arrays.toString(data));
    }
}
