public class EqualityOfTwoArray {
    //program to find out two array are same
    public static void checkdata(int[]check1,int[]check2 ){
        boolean value = true;
        //code to check length of variable
        if(check1.length==check2.length){
            //code to check all first data
            for(int i =0; i< check1.length; i++){
                //code to check all second data
                for(int j=0; j<check2.length; j++){
                    //code to check first & second data matched
                    if(check1[i] == check2[j]){
                        //when found result call as
                        value = true;

                    }
                }
            }
        }
        else {
            // all above not matched result called
            value = false;
        }
        if(value){
            // value = true print this statement
            System.out.println("Both dara are equal");
        }
        else {
            //value =false print this statement
            System.out.println("Both data are not equal");
        }
    }

    public static void main(String[] args) {
        //Declaring initialisation & instantiation of variable in integer
        int data1[]={10,15,20,25,30};
        int data2[]={10,20,30,40,50};
        int data3[]={10,15,20,25,30};
        //calling method to check
        checkdata(data1,data3);


    }
}
