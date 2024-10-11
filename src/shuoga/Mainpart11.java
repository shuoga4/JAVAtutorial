package shuoga;

public class Mainpart11 {
    public static void main(String[] args) {
        double num = Math.random() * 100;
        int random = (int) num; // 0~49, 50~99
        String coin = "";
        coin = num < 50 ? "main" : "back";
        System.out.println(coin);
    }
}
