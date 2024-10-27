package shuoga;

import java.util.Scanner;

class LogicPart{
    private double A,B;
    private int operation;
    LogicPart(double A, double B,int operation){
        this.A = A;
        this.B = B;
        this.operation = operation;
    }

}

public class Mainpart17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:+ , 2:- , 3:* , 4:/");
        int operation = scanner.nextInt();
        System.out.println("type number A");
        float variable_A = scanner.nextFloat();
        System.out.println("type number B");
        float variable_B = scanner.nextFloat();

        // logic

        System.out.println();
    }
}
