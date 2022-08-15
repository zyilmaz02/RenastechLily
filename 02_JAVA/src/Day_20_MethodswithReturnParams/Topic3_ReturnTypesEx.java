package Day_20_MethodswithReturnParams;

public class Topic3_ReturnTypesEx {

    // write a method where it gets an Array of int as input parameter and returns to the max number in the array

    public static void main(String[] args) {

        int [] arr1 = {-90,-30,-20,0};
         int maximum = MAX(arr1);

        System.out.println("The Max value is: "+maximum);

        System.out.println("The other way of printing it : "+ MAX(arr1));
        // add 5 to the maximum value;

        int addedversion = maximum+5;

        // subs 10 from the max value;

        int subs = maximum - 10;

        System.out.println("Added version is : "+addedversion);

        System.out.println("Subs version is: "+subs);

    }

    // the method starts here
    public static int MAX(int [] JustName){
        int max = JustName[0];
        for (int a: JustName) {

            if(max<a){
                max = a;
            }

        }
        return max;
    }







}
