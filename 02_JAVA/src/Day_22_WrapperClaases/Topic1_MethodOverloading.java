package Day_22_WrapperClaases;

public class Topic1_MethodOverloading {

    // Write a method where it takes String and a char parameters end return to a string where the original
    // String does not contains the char that has been used as an input
    // ex;  'ABCDSESRT", 'S' ====> "ABCDERT" ('S' been removed)

    public static String RemoveChar(String str,char c){

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == c){ //"ABDCRTYTHIS", 'T'
                continue;
            }else{
                newStr = newStr + str.charAt(i);
            }

        }
        return newStr;

    }
    public static String RemoveChar(String str1, char ch,int start,int end){

        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {

            if(i<start || i>=end){
                str2 = str2 +str1.charAt(i); //  "SRTERTE" "T" Start :2 end: 4 ==
            }else{
                if(str1.charAt(i)==ch){
                    continue;
                }else{
                    str2 = str2+str1.charAt(i);
                }
            }

        }
        return str2;
    }

    public static void main(String[] args) {
        String name  = "Ziya,Yaseen,Gulay";
        String [] names = name.split(","); /// ["Ziya","Yaseen","Gulay"]

        // Write a method where it takes String and a char parameters end return to a string where the original
        // String does not contains the char that has been used as an input
        // ex;  'ABCDSESRT", 'S' ====> "ABCDERT" ('S' been removed)

        // "abcdel",'c'
        System.out.println("This is the new String: "+RemoveChar("ABDCRTYTHIS",'T'));

        String St = RemoveChar("ABDCRTYTHIS",'T');
        ///St= St.toLowerCase();

        System.out.println("This is a new String: "+St);

        // Use the existing method where you also pass the input parameters where indicates the starting index and
        // ending index
        /// ex : "ERTESESR", 'E', 2,4 ==> "ERTSESR


        String whatever = "DCFSSERTEDSAAADFSDFAF";

        String newVal = RemoveChar(whatever, 'S',4,12);

        System.out.println("The new string is: "+newVal);

    }
}
