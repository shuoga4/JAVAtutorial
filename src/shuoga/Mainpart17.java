package shuoga;

import java.util.Scanner;

class Calc{
    private final double A,B;
    private double sum;
    private final int operation;

    Calc(double A, double B,int operation){
        this.A = A;
        this.B = B;
        this.operation = operation;
    }
    public double calc (){
        switch (operation){
            case 1: sum = A + B;break;
            case 2: sum = A - B;break;
            case 3: sum = A * B;break;
            case 4:
                if (B == 0)sum = 0;
                else sum = A / B;
                break;
        }
        return sum;
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

        Calc calc = new Calc(variable_A,variable_B, operation);
        System.out.println("the answer is : " + calc.calc());

    }
}
