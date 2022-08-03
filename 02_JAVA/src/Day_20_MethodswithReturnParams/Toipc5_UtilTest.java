package Day_20_MethodswithReturnParams;

import MyUtil.TestCLassforPublic;

import java.util.*;


public class Toipc5_UtilTest {

    public static void main(String[] args) {

        TestCLassforPublic.FromDiffClass("Ziya","Yilmaz"); // I am able to get to that method it is
        // because defined as public
        double rtn  = TestCLassforPublic.Sum(90.34,76.43); // Same for this one

        //
        // TestCLassforPublic.PMethod ==> I do not have access because it is defined as private, or protected or
        // default

        System.out.println(rtn);


    }
}
