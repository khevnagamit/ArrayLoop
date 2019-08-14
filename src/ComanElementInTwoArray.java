import java.util.Arrays;

public class ComanElementInTwoArray {
    //Program to findout Common Element in two arrays
    public static void main(String[] args) {
        //Declaring initialisation & instantiation of variable in integer
        int data1 [] ={10,15,20,25,30,35,40};
        int data2 []= {3,9,15,24,30,33,36};
        //print out my first data
        System.out.println("My First Group Data : " + Arrays.toString(data1));
        //Print out my second data
        System.out.println("My Second Group Data : " + Arrays.toString(data2));
        //code to check first data array
        for(int i=0;i<data1.length;i++){
            //code to check second data array
            for(int j=0; j<data2.length;j++){
                //code to check common data
                if(data1[i]==data2[j]){
                    //after finding common data print that data
                    System.out.println("Common data in both group is :" + data2[j]);
                }

            }
        }

    }
}
