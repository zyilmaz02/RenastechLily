package Day_21_MethodsAndMethodOverload;

public class Topic2_MethodOverloading {

    // Method iverloading is where we use the method to handle same action with multiple/different inputs.

    public static void NAME(String fname){
        System.out.println("The first name is: "+fname);
    }
    public static void NAME(String FName,String LName){
        System.out.println("The first name: " +FName+" Last Name: "+LName);
    };

    public static String NAME(String Fname, String LName, int age){
        System.out.println("The first name: "+Fname);
        return "The First Name is: "+Fname+" The Last Name: "+LName+ "Age is: "+age;
    }

    public static void main(String[] args) {
        NAME("Ziya");
        NAME("ZIya","Yilmaz");
        System.out.println(NAME("Sarp","Senocak",30));

    }
}
