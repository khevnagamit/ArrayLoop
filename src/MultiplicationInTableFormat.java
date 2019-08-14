public class MultiplicationInTableFormat {
    //program to do multiplication in table format using do while
    public static void main(String[] args) {
        //Declaring & initialisation of variable in integer
        int i=1;
        int j=1;
        //code 1 to do at least
        do{
            //code 2 to do
            do{
                //printing current value of i*j
                System.out.print(i*j +" ");
                // i increase with 1
                i++;
            }
            //code 2 to stop
            while (i<4);
            //breaking line
            System.out.println("");
            //j increase with 1
            j++;
            //initialising i again
            i=1;
        }
        //code 1 to stop
        while (j<4);
        }
    }

