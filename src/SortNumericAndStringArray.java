import java.util.Arrays;

public class SortNumericAndStringArray {
    public static void main(String[] args) {
        //Declaring initialisation & instantiation of variable in integer
        int group1[]={12,25,87,67,43};//can change variable value here
        //print out actual data
        System.out.println("my actual data are :"+ Arrays.toString (group1));
        //code for sort value of array
        Arrays.sort(group1);
        //code to print out sorted data
        System.out.println("my sorted data are :"+ Arrays.toString(group1));

        //Declaring initialisation & instantiation of variable in string
        String group2[]={"London","Manchester","Birmingham","Leicester","Nottingham"};//can change variable data here
        //print out actual data
        System.out.println("my actual data are :"+ Arrays.toString (group2));
        //code for sort value of array
        Arrays.sort(group2);
        //code to print out sorted data
        System.out.println("my sorted data are :"+ Arrays.toString(group2));
    }
}
