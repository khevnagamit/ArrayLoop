public class TransposeMatrix {
    //program in 2-d  to transpose a matrix row value in column &column value in row
    public static void main(String[] args) {
        //Declaring initialisation & instantiation of variable in integer
        int data[][]={{11,12,13},{14,15,16},{17,18,19},{20,21,22}};
        //print line my actual data
        System.out.println("My Actual Data :");
        //code to check in row with index number
        for(int i=0;i<data.length;i++){
            //code to check in column with index number
            for(int j=0;j< data[i].length ;j++){
                //print out row vs column
                System.out.print(data[i][j]+ " ");
            }
            //when row finish & going for next row goes in next line print nothing
            System.out.println("");
        }
        //print line transpose matrix data
        System.out.println("Transpose Matrix data :");
        //code to check when i have less column & more row
        if(data.length>0) {
            //code to check in row with index number
            for (int i = 0; i < data[0].length; i++) {
                //code to check in column with index number
                for (int j = 0; j < data.length; j++) {
                    //print data column vs row
                    System.out.print(data[j][i] + " ");
                }
                //to change line after above action
                System.out.println("");
            }
        }
    }
}
