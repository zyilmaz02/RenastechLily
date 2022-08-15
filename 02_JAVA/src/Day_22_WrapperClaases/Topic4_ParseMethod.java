package Day_22_WrapperClaases;

public class Topic4_ParseMethod {

    //	methods:
//            parse methods: converts string of text to the primitives, returns primitive values
//            "123"
//
//            valueOf methods: converting string to wrapper class value, returns wrapper class values

    public static void main(String[] args) {
        String intasString = "6785";
        intasString = intasString + 25; // "678525"

        System.out.println("the value is: "+intasString);

        int a  = Integer.parseInt(intasString); // a = 678525

        int c = a+25; // c = 678525+25 = 678550;
        System.out.println("the value as integer: "+c);

        String doubleasString  = "789.6564";

        double db1 = Double.parseDouble(doubleasString);

        System.out.println("The double value as numbers: "+db1);

        System.out.println("The double value plus 35 is: "+(db1+35));

        String std1 = "6789.543";

        Double number = Double.parseDouble(std1);

        double d1 = number +56;

        System.out.println("The is the test for d1: "+d1);

        //            valueOf methods: converting string to wrapper class value, returns wrapper class values

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String st10 = "7890.76";

        Double db6 = Double.valueOf(st10); // get the String and convert it to Double wrapper class.


        double name = db6; // unboxing

        System.out.println("The double value of: "+db6);

        //String yaseen = "6568hf"; Can not be parsed when there is other chars in the String other than numbers

       // int var1  = Integer.parseInt(StNum);






    }



}
