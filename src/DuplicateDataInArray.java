import java.util.Arrays;

public class DuplicateDataInArray {
    //Program to find out duplicate data in array
    public static void main(String[] args) {
        //Declaring initialisation & instantiation of variable in integer
        int data[]={10,15,20,25,10,25,40};
        String correct;
        String ans ="NO";
        //printing my data
        System.out.println("This is my data : "+ Arrays.toString(data));
        //code to check all element
        for(int i=0;i<data.length;i++){
            //code to check second time all element
            for (int j=i+1;j<data.length;j++){
                //to check similarity by checking both time
                if(data[i]==data[j] && i!=j){
                    System.out.println(data[j]);
                    ans ="Yes";
                }

            }
        }
        correct = ans;

        if (ans == "Yes") {
            //when find similar data print out duplicate data
            System.out.println("Duplicate value printed above ");
        }
        else {
            System.out.println("Duplicate value not found");
        }
    }
}
