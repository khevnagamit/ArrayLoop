public class Triangle {
    //program to make triangle with @
    public static void main(String[] args) {
        //code repeat for row
        for(int i=0;i<=5;i++){
            //code repeat for column
            for (int j =0;j<=i;j++){
                //print this
                System.out.print("@ ");
            }
            //to change line
            System.out.println("");
        }
    }
}
