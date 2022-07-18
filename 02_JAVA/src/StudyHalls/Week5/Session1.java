package StudyHalls.Week5;

public class Session1 {
    public static void main(String[] args) {

        ////    Write a  program that can reverse  a String
        ////
        ////    Ex: Reverse("ABCDE"); ==> EDCBA
        //      Ex : Java ==> avaJ

        String str="level";
        //          01234

      //  System.out.println(str.charAt(0));
        String reversed="";

        //           5-1

        for (int i =str.length()-1 ; i>=0  ; i--) {
            //       startingP.    endPoint ; inc


            reversed+=  str.charAt(i);
            //reversed=reversed +str.charAt(i)


        }

        System.out.println("reversed = " + reversed);

        System.out.println("*****************************");


        /** Task : Write a program that checks if a String is a Palindrome.
                *
         * Example: input : Java , output: java is not  palindrome
         * Example: input : kayak , output : kayak is a palindrome
         * Example: input level , ouput : level is a palindrome
         *
         * tip: A palindrome is a word, number, phrase, or other sequence of characters
         * which reads the same backward as forward, such as madam or racecar.
         */


        String str2="java";

        String strReversed="";

        for (int i = str2.length()-1; i >=0 ; i--) {

            strReversed+=str2.charAt(i);

        }

        System.out.println("strReversed = " + strReversed);


        if (str2.equals(strReversed)){

            System.out.println(str2 +" is a palindrome string");
        }else {
            System.out.println(str2 +" is not a palindrome string");
        }

        System.out.println("********************");

        String result="";

        result=(str2.equals(strReversed)) ? " is a palindrome " : " is not a palindrome";

        System.out.println( str2 +result);






    }
}
