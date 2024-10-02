package shuoga;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // here is important for now
        System.out.println("Hello world!");

        /*      java part 2
        datatype name_of_variable; // Declaration
        datatype name_of_variable = value_of_variable; // Initialization
        (assignment of value)
        datatype
        int
        float (number end f)
        double
        boolean
        char 'single character' ex A
        string "multiple character" ex hello



         */

        /*  java part 4
            input and output


            Output    */

        System.out.println("aoeiaoeiaoeiaoeiaoei");
        int age = 21;
        System.out.println("my age is " + age);

        /* Input   */

        Scanner shuogascanner = new Scanner(System.in);

        int number = shuogascanner.nextInt();
        System.out.println("int only " + number);

        shuogascanner.nextLine();
        String stringinput = shuogascanner.nextLine();
        System.out.println(stringinput + " was typed");





    }
}