package Day_16_ArraysCont;

import java.util.Arrays;

public class Topic3_ArraysUtil {

    // Arrays has a utility as well
    public static void main(String[] args) {

        int [] name = {3,4,5,2,1,-90,-230};

        for (int i = 0; i < name.length; i++) {

            System.out.println(name[i]);

        }
        System.out.println("array: "+name);

        System.out.println("___________________________________-");

        System.out.println(Arrays.toString(name)); // Arrays.toString(arrayName) will change the format

        String [] starray = {"Sarp","Elif","Gulay"};

        System.out.println("________________________________");
        System.out.println(starray);

        System.out.println("+++++++++++++++++++++++++++++++++++");

        System.out.println(Arrays.toString(starray));
    }
}
