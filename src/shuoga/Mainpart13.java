package shuoga;

// https://magazine.techacademy.jp/magazine/28637
// Regular Expression

public class Mainpart13 {
    public static void main(String[] args) {
        String shuoga = "shuoga";
        System.out.println("My name is " + shuoga);
        String first = shuoga.substring(0,1); // get first char
        System.out.println(first);
        String firstup = first.toUpperCase(); // make it upper
        System.out.println(firstup);
        String reshuoga = shuoga.replaceFirst(first,firstup); // replace it
        System.out.println("My name is " + reshuoga);

        
    }
}
