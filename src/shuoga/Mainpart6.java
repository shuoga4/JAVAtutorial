package shuoga;

import java.util.Scanner;
import java.util.concurrent.Callable;

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



    }
}
