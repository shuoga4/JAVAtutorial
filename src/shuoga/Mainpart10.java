package shuoga;

import java.util.Scanner;

public class Mainpart10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:+ , 2:- , 3:* , 4:/");
        int operation = scanner.nextInt();
        System.out.println("type number A");
        float variable_A = scanner.nextFloat();
        System.out.println("type number B");
        float variable_B = scanner.nextFloat();
        float sum;

        switch (operation){
            case 1:sum = variable_A + variable_B; break;
            case 2:sum = variable_A - variable_B; break;
            case 3:sum = variable_A * variable_B; break;
            case 4:sum = variable_A / variable_B; break;
        }

    }
}
