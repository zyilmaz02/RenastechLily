package Day_21_MethodsAndMethodOverload;

public class Topic1_MethodExample {

    // Write A code where you make Omelette,

    // Step by step instructions
    // step 1) turn ont he stove
    // Step 2) Add butter based on how many people will be eating
    // Step 3) wait for 5 mins
    // Step 4) get amount of eggs needed based on how people will eat
    // step 5) scrumble your agg and add it to the pan.
    // Step 6) for medium -- 4 mins  for well done wait 6 mins

    public static void OnOff(String onoff){ // step 1) turn ont he stove
        if (onoff.equalsIgnoreCase("On")){
            System.out.println("The Stove is ON");
        }else{
            System.out.println("The Stove is OFF");
        }

    }
    public static void AddButter(int people){ //Step 2) Add butter based on how many people will be eating

        if(people <= 2){
            System.out.println("2 mg butter is added to pan");
        }else if(people >2 && people<5 ){
            System.out.println("4 mg butter is added to pan");
        }
        else{
            System.out.println("8 mg butter is added to pan");
        }
    }
    public static String Eggs(int eggs){ // 4) get amount of eggs needed based on how people will eat
        return eggs+" of eggs added";
    }
    public static void Scrum(){ //step 5) scrumble your agg and add it to the pan.
        System.out.println(" The eggs are mixed and added to the pan");
        System.out.println(Eggs(65));

    }

    public static void Wait(int mins){ // Step 3) wait for 5 mins
        // and Step 6) for medium -- 4 mins  for well done wait 6 mins

        for (int i=0; i<mins;i++){
            System.out.println("one minute passed ");
        }
        System.out.println(mins+ "is DONE");
    }



    public static void main(String[] args) {

        int ppl = 4;
        String how = "mid"; // "well"


        OnOff("ON");

        AddButter(ppl);
        Wait(4);
        System.out.println(Eggs(5));
        Scrum();
        if(how.equalsIgnoreCase("mid")){
            Wait(4);

        }else {
            Wait(6);
        }

        System.out.println("The Omelette is DONE");


        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        Scrum();



    }
}
