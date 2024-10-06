package shuoga;

import java.util.Scanner;

public class Mainpart6 {
    public static void main(String[] args) {
        System.out.println("hello guys");

        //logic
        //and == && , or == || , not == !

        //comparison
        // == > < <= >= !=

        //Assignment =
        /*
        variable += 100 ( variable = variable + 100)
        variable ++
        variable -=
        variable --
        variable *=
        variable /=
        variable %=

         */




        /*
        control flow (if and switch)


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("from 0 to 99, what's your favorite number?");
        int favnum = scanner.nextInt();
        double random = Math.random();
        random *= 100;
        random = Math.floor(random);

        if (favnum == (int)random){
            System.out.println("you did it!");
        }else if (favnum > (int)random){
            System.out.println("you are bigger");
        }else {
            System.out.println("you are smaller");
        }
        System.out.println("the number was " + (int)random);

        // Switch

        System.out.println("What's your level? choose from 1 to 5");
        int level = scanner.nextInt();
        switch (level){
            case 1: System.out.println("you r base level"); break;
            case 2: System.out.println("you r 2 level"); break;
            case 3: System.out.println("you r 3 level"); break;
            case 4: System.out.println("you r 4 level"); break;
            case 5: System.out.println("you r max level"); break;
        }




    }
}
