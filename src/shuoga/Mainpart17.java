package shuoga;

import java.util.Scanner;

class Calc{
    private double sum;

    public double calc (Data data){
        switch (data.operation){
            case 1: sum = data.A + data.B;break;
            case 2: sum = data.A - data.B;break;
            case 3: sum = data.A * data.B;break;
            case 4:
                if (data.B == 0)sum = 0;
                else sum = data.A / data.B;
                break;
        }
        return sum;
    }
}

class Input{
    public void input(Data data){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1:+ , 2:- , 3:* , 4:/");
        int operation = scanner.nextInt();

        System.out.println("type number A");
        float variable_A = scanner.nextFloat();

        System.out.println("type number B");
        float variable_B = scanner.nextFloat();

        data.data(variable_A,variable_B,operation);
    }
}

class Data{
    public double A,B;
    public int operation;

    public void data(double A, double B, int operation){
        this.A = A;
        this.B = B;
        this.operation = operation;
    }
}

public class Mainpart17 {
    public static void main(String[] args) {
        Data data = new Data();
        Input input = new Input();
        Calc calc = new Calc();

        input.input(data);
        System.out.println("the answer is : " + calc.calc(data));

    }
}
