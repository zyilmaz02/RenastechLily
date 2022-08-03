package Day_20_MethodswithReturnParams;

public class Topic2_ReturnType1 {
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)

    public static String Name(int a, int b){

        if(a>b){

            return "Ziya";
        }
        else if(b>a){
            return "Jason";
        }else{
            return "Huseyin";
        }

    }

    public static void main(String[] args) {
        String Canrem = Name(3,4);
        //String Onur  = Name(90,100);
        System.out.println("The name is: "+Canrem);
    }
}
