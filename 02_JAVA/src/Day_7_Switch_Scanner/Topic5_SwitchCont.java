package Day_7_Switch_Scanner;

import java.sql.SQLOutput;

public class Topic5_SwitchCont {

    public static void main(String[] args) {

        String two = "We";

        switch (two){
            case "Mo":
                System.out.println("Monday");
                break;
            case "Tu":
                System.out.println("Tuesday");
                break;
            case "We":
                System.out.println("Wednesday");
                break;
            case "Th":
                System.out.println("Thursday");
                break;
            case "Fr":
                System.out.println("Friday");
                break;
            case "Sa":
                System.out.println("Saturday");
                break;
            case "Su":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid");

        }


    }
}
