package Day_14_NestedLoops;

public class Topic1_NestedForLoops {
    /* Loop {  // Outer Loop
            dfhskjdfhj
            Loop{  // Inner Loop
                    dsfilsdfjisdf
            }
    }

     */

    public static void main(String[] args) {
        int weeks = 3; // for each week we have 7 days

        int days = 7;

        for (int i = 1; i <=weeks; i++) {  // outer loop

            System.out.println("Week " +i); // Range time which 3
            for (int j = 1; j <= days; j++) { // Inner loop
                System.out.println("        Days: " +j);  // Iterations for Outer Loop X iterations for Inner Loop = 3*7 = 21

            }

        }


    }

}
