package shuoga;

import java.util.Scanner;

public class Mainpart16 {
    public static void main(String[] args) {
        System.out.println("put the number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        /*
        numは、上限回数
        iは、試行回数
        tempは、F(n-1)
        temp2も必要？F(n-2)
        temp3も必要？F(n)
         */
        int temp = 0;
        int temp2 = 1;
        int temp3 = 1;
        if (num <= 1) {
            System.out.println("404");
        }else{
            for (int i = 0; i < num; i++){
                temp3 = temp + temp2;// F(n) = F(n-1) + F(n-2)
                // すべてのnに+1する
                temp2 = temp;
                temp = temp3;
            }
        }
        System.out.println(temp3);
    }
}
