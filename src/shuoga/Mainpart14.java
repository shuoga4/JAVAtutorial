package shuoga;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mainpart14 {
    //しりとりゲーム
    public static void main(String[] args) {
        // Set使う
        Set<String> siritori = new HashSet<>();
        System.out.println("Say the first word : ");
        Scanner scanner = new Scanner(System.in);
        String myword = scanner.next();
        // 正規表現で次の言葉としりとりできてるか判定
        // 正規表現で謎の文字が入ってないか確認（主に数字)
        //
    }
}
