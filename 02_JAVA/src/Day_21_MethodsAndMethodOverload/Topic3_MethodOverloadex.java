package Day_21_MethodsAndMethodOverload;

public class Topic3_MethodOverloadex {

    // write a code where it sums numbers entered by user.
     public static int SUM(int a,int b){
        int result = a+b;
        //int c = 10;
        ///System.out.println("The result is:" +result);
        return result;
    }

     public static void SUM(int one, int two,int three){
         int sulotion = one +two+three;
         int sumthing = sulotion +10+50+60;
         System.out.println("The something is: "+sumthing);

    }
    public static String SUM(int b, int c,int r,int t){

         int result = b+c+r+t;

         return "The result is "+result;
    }

    public static String SUM(int b, int c,int r,int t,String st){
         int cal = b+c+r+t;


        return cal + st;
    }

    public static void SUM(int num1, int num2,String str,int num3,int num4){
        int cal = num1+num2+num3+num4;

        String sty = cal+str;
        System.out.println("Yhe new value is: " +sty);



    }



    public static void main(String[] args) {

        int add10=  SUM(1,2) + 10;// 3
        System.out.println("The  result is after adding 10: "+add10);

        SUM(8,4,6);
        String re = SUM(90,45,67,89);
        System.out.println("The result after string return type: "+re);

        String ret = SUM(6,3,8,9,"Ziya");
        System.out.println(ret);
        SUM(2,3,4,5,"Ziya");
        SUM(6,7,"TIL",5,6);


    }
}
