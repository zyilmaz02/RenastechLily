package Day_11_ForLoops;

public class Topic1_ForLoopCont {

    // for(startpoint; endpotin; iteration){

    // Code Block that will be ran

//} this is how we declare For Loop

    public static void main(String[] args) {

        // Write a for loop that  increase by 2 for each iteration
        for(int i = 1; i<100;i+=2){ // 1, 3,5 .......101
            System.out.println("The value of i: " +i); // 1,3,5, ......99
        }


        // write a code that counts the iterations
        int count = 0;
        for(int i = 1; i<100;i+=2){
            System.out.println("The value of i: " +i); //  value 1,3,5 ....99
            count = count +1; // 1,2,3,4,5,6,7,8,.......50

        }
        System.out.println(count);
    }
}
