public class ThreeFiveDivision {
    //program to find out numbers from 1 to 100 which can divide by 3 & 5

    public static void main(String[] args) {
        //print line
        System.out.println("Number divided by 3 :");
        //code repeat until condition fulfill
        for(int i=0;i<=100;i++){
            //initialising & declaring the reminder when do division with 3
            int data = i%3;
            //checking reminder
            if(data == 0){
                //after find reminder 0 print this
                System.out.print(i + " ");
            }
        }
        //print line
        System.out.println("\n\nNumber divided by 5 :");
        //code repeat until condition fulfill
        for (int j=0;j<=100;j++) {
            //initialising & declaring the reminder when do division by 5
            int data2 = j % 5;
            //checking reminder
            if (data2 == 0) {
                //after find reminder 0 print this
                System.out.print(j + " ");
            }
        }
    }
}
