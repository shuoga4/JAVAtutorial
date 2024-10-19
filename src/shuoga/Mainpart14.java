package shuoga;

import java.util.*;

public class Mainpart14 {
    //しりとりゲーム
    public static void main(String[] args) {

        List<String> siritori = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String yourword = null;
        while (true) {

            System.out.println("Say the word : ");
            String myword = scanner.next();
            siritori.add(myword);
            if (yourword == null) {
                System.out.println("1st time ");

            }else if(myword.charAt(0) == yourword.charAt(yourword.length() - 1)) {
                System.out.println("matched.");
            }else {
                break;
            }
            System.out.println("Say the word : ");
            yourword = scanner.next();
            siritori.add(yourword);
            if (yourword.charAt(0) == myword.charAt(myword.length() - 1)) {
                System.out.println("matched.");
            }else {
                break;
            }

        }
        System.out.println("lose");


    }
}
