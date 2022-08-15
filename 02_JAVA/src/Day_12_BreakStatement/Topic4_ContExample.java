package Day_12_BreakStatement;

public class Topic4_ContExample {

    public static void main(String[] args) {
        // Write a code where it checks every chars in a string and when it sees a "L" or "A" pass
        // print the end result

        String ex = "HELLOAPPLE";
        String result = "";

        for (int i = 0; i < ex.length(); i++) {

            //result = result + ex.charAt(i); // this will not serve your point

            if(ex.charAt(i) == 'L' || ex.charAt(i) == 'A'){
                continue;
            }
            result = result + ex.charAt(i); // when i =0 ==> result= "", result = "" +"H"
                                            // when i = 1 ==> result = "H" == "H"+"E" ==> result = "HE"
                                            // when i = 4 === result = "HE" ==> "HE" +"O" ==>result = "HEO"

            // System.out.println(ex.charAt(i));


        }
        System.out.println(result);

    }
}
