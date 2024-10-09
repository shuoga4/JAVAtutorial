package shuoga;

import java.util.Scanner;

public class Mainpart9 {
    public static void main(String[] args) {


        // For and While loop

        //For


        for(int i = 0; i == 0; i++)
            System.out.println(i);


        // count hitter but use for loop


        Scanner scanner = new Scanner(System.in);
        System.out.println("from 0 to 99, what's your favorite number?");
        int favnum = scanner.nextInt();
        double random = Math.random();
        random *= 100;
        random = Math.floor(random);

        for (int i = 0; i == 0;){
            if (favnum == (int)random){
                System.out.println("you did it!");
                i = 1;
                continue;
            }else if (favnum > (int)random){
                System.out.println("you are bigger");
            }else {
                System.out.println("you are smaller");
            }
            System.out.println("try again!");
            favnum = scanner.nextInt();
        }

        boolean living = true;
        int age = 21;
        double randomage;
        int chance_of_death;

        while(living){
            System.out.println("u r living for now");
            randomage = Math.random() * 100;
            chance_of_death = (int)randomage;
            if (chance_of_death >= 50) living = false;
            System.out.println(chance_of_death);
        }


    }

    public static class Mainpart902 {
        public static void main(String[] args) {
            boolean living = true;
            int age = 21;
            double randomage;
            int chance_of_death;
            Scanner scanner = new Scanner(System.in);

            while(living){
                System.out.println("u r living for now");
                randomage = Math.random() * 100;
                chance_of_death = (int)randomage;
                var i = scanner.next();
                System.out.println(chance_of_death);
                if (chance_of_death >= 50) { // u can change number
                    living = false;
                    System.out.println("you are dead!");
                }

            }
        }
    }
}
