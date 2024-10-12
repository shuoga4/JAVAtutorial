package shuoga;

import java.util.Scanner;

public class Mainpart12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int)(Math.random() * 100);
        System.out.println(random);
        int smth = Integer.parseInt(scanner.next());
        String smth2 = scanner.nextLine();
        System.out.println(smth + smth2);

    }
}
