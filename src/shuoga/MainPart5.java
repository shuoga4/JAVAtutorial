package shuoga;

import java.util.Scanner;

public class MainPart5 {
    public static void main(String[] args) {
            /*
        math

        + - * / %
        % is remainder
        100 % 2 = 0
        101 % 2 = 1



        math methods         */

        System.out.println("absolute : " + Math.abs(-1000));



        System.out.println("ceiling : " + Math.ceil(1.6453425)); // 1.34 = 2.0 ,1.64 = 2.0 rounding up

        System.out.println("round : " + Math.round(1.6453425)); // 1.34 = 1 ,1.64 = 2 round

        System.out.println("floor : " + Math.floor(1.6453425)); // 1.34 = 1, 1.64 = 1 rounding down



        System.out.println("max : " + Math.max(25,56));

        System.out.println("min : " + Math.min(6,7));


        // a little bit of learning math method

        System.out.println("absExact : " + Math.absExact(-324234234));

        System.out.println("cos(0) : " + Math.cos(0));

        System.out.println("ulp : " + Math.ulp(1));


        /*
        booleans and logic
        comparison (< > <= >= == !=)
         */


        int point = 60;
        int pointtopass = 67;
        boolean haspassedtest = point >= pointtopass;
        System.out.println("has passed the test? : " + haspassedtest);

        //logic     and or not
        // same as turing complete

        int point2 = 68;
        int pointtopass2 = 67;
        boolean haspassedtest2 = point2 >= pointtopass2;
        System.out.println("has passed the test? : " + haspassedtest2);

        // and - &&

        boolean hasbothtestpassed = haspassedtest2 && haspassedtest;
        System.out.println("hasbothtestpassed : " + hasbothtestpassed);

        //let's make some question

        Scanner scanner= new Scanner(System.in);  //Scannerって複数変数用意する必要ないのか？

        //age in int
        System.out.println("What's your age?");
        int age = scanner.nextInt();

        //beer in boolean
        System.out.println("answer true or false. Do you like beer?");
        boolean likebeer = scanner.nextBoolean();

        //comparison
        int agefordrink = 20;
        boolean canyoudrink = agefordrink <= age;

        //having fun drinking at legal age
        boolean fundrink = canyoudrink && likebeer;

        System.out.println("have fun drinking! : " + fundrink);











    }
}
