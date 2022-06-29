package Day_3ArtimaticOperations;

import java.sql.SQLOutput;

public class StringsVariable {

    public static void main(String[] args) {
        // String is NOT a primitive Data Type.

        String name = "123445"; // this is a text not a number
        String name2 = "Ziya"; // That is also a text

        String name3 = name + name2;
        System.out.println(name3);
        String name4 = name + " Likes to teach " +name2;
        System.out.println(name4);

        System.out.println("This is name2: " +name2);
        int a = 8;

        System.out.println("This is the number a: " +a);

        float numf2 = 7.9f;

        System.out.println("This is the float number: " +numf2);
        String thisisatext = "Yasin this is a text 123433";

        char ch = 'R';
        String st = "Toys"+"-"+ch+" "+"Us";
        System.out.println(st);

        int numnum = 34;
        String nam20 = "This is Us ";
        String nam30 = nam20 + " " + numnum;
        System.out.println(nam30);



    }



}
