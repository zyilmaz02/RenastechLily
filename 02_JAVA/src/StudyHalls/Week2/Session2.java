package StudyHalls.Week2;

import java.util.Scanner;

public class Session2 {

    public static void main(String[] args) {

        //Set-up a scanner to retrieve data from User
      Scanner scanner= new Scanner(System.in);

//        //Decide what kind of the data will be taken
//        System.out.println("Please enter your name!");
//        String name=scanner.nextLine();
//
//        System.out.println("Hi "+name+" Please enter your BirtYear");
//        int birthYear=scanner.nextInt();
//
//        System.out.println(name+ ",you are "+(2022-birthYear)+" years old");


        System.out.println("Please enter your team name");
        String teamName=scanner.nextLine();
        String teamMascot="";

        switch (teamName){
            case "team1":
                teamMascot="Lion";
                break;
            case "team2":
                teamMascot="Brancos";
                break;
            case "team3":
                teamMascot="wolf";
                break;
            default:
                teamMascot="your input didn't match";

        }

        System.out.println("You entered : "+teamName);
        System.out.println("teamMascot = " + teamMascot);


    }
}

