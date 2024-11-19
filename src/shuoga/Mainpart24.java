package shuoga;
import java.util.*;



interface Operation {
    float perform(float a, float b);
    String showOp();
}



class Add implements Operation {
    @Override
    public float perform(float a, float b) {
        return a + b;
    }

    @Override
    public String showOp() {
        return "+";
    }
}

class Subtract implements Operation {
    @Override
    public float perform(float a, float b) {
        return a - b;
    }

    @Override
    public String showOp() {
        return "-";
    }
}

class Divide implements Operation {
    @Override
    public float perform(float a, float b) {
        if(b == 0) return 0;
        else return a / b;
    }

    @Override
    public String showOp() {
        return "/";
    }
}

class Multiply implements Operation {
    @Override
    public float perform(float a, float b) {
        return a * b;
    }

    @Override
    public String showOp() {
        return "*";
    }
}



class Calc2 {
    private final Operation operation;
    private final float a;
    private final float b;

    Calc2(Operation operation, float a, float b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    public float calc() {
        return operation.perform(a, b);
    }

    public String showOp(){
        return a + " " + operation.showOp() + " " + b;
    }
}



class Chooser {
    public Operation choose(int num) {
        if(num == 1) {
            return new Add();
        } else if(num == 2) {
            return new Subtract();
        } else if(num == 3) {
            return new Multiply();
        } else if(num == 4) {
            return new Divide();
        } else {
            return null;
        }
    }
}



public class Mainpart24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1:+ , 2:- , 3:* , 4:/");
        int choose = scanner.nextInt();

        Chooser chooser = new Chooser();
        Operation operation;
        operation = chooser.choose(choose);

        if (operation == null) {
            System.out.println("err");
        } else {
            System.out.println("a");
            float a = scanner.nextFloat();
            System.out.println("b");
            float b = scanner.nextFloat();

            Calc2 calc = new Calc2(operation,a,b);
            System.out.println(calc.showOp() + " = " + calc.calc());

        }

    }

}