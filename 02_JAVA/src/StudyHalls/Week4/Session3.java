package StudyHalls.Week4;

public class Session3 {
    public static void main(String[] args) {

        /*

        Method	              Description                                                   Return Type


         charAt()	          Returns the character at the specified index (position)	        char
         */

        String str1="Panda";
        //

        System.out.println("str1.charAt(0) = " + str1.charAt(0)); // we return index 0 value
        //str1.charAt(0) = P

        //Index number starts with 0
        // P a n d a
        //0 1 2 3 4
        System.out.println("str1.charAt(1) = " + str1.charAt(1));
        System.out.println(str1.charAt(3));

        // There 2 importaant points.
        // We shouldn't put a number which is not an index.

     //    System.out.println(str1.charAt(5)); //StringIndexOutOfBoundsException: String index out of range: 5

        // We use for last characther.

        //length
        System.out.println(str1.length()); //5

        String str2="java";

        // what will print last char. of str2
        System.out.println(str2.charAt(3));//a

        String str3="Renastech";
        //
        System.out.println(str3.charAt(8)); //
        System.out.println(str3.length());// 9

        int lenForStr3=str3.length();// 9

        System.out.println(str3.charAt(lenForStr3-1)); //h

        String s="Mahir";
        //        01234
        int length=s.length();

        System.out.println(length); //5
        System.out.println(s.charAt(4));//r

        System.out.println(s.charAt(length-1)); // r

        String a1="Apple";
        //        01234
        //printing the last char.
        System.out.println(a1.charAt(4));
                          //          5-1
        System.out.println(a1.charAt(a1.length() -1 ));

        String z="asdfafafafafas2131231";
        //
        System.out.println(z.charAt(z.length()-1));

        //concat()	          Appends a string to the end of another string	                    String

        System.out.println("#########################");

        String fName="Elif";
        String lName="Akyel";

        String fullName=fName.concat(lName);

        System.out.println("fullName = " + fullName);

        String fullName2=fName.concat(" Akyel");

        System.out.println("fullName2 = " + fullName2);

        String fullName3="Elif".concat(" Akyel");
        System.out.println("fullName3 = " + fullName3);

        System.out.println("%%%%%%%%%%%%%%%%%%%%");

        String number1="10";
        System.out.println(number1.concat("5")); //105

        //startsWith()	      Checks whether a string starts with specified characters	        boolean

        String b="Renastech";

        System.out.println(b.startsWith("r")); // false;

        //endsWith()	          Checks whether a string ends with the specified character(s)	    boolean

        System.out.println(b.endsWith("h"));







    }
}
