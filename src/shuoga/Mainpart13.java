package shuoga;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mainpart13 {
    public static void main(String[] args) {
        String shuoga = "shuoga";
        System.out.println("My name is " + shuoga);
        String first = shuoga.substring(0,1); // get first char in string
        // System.out.println(first);
        String firstup = first.toUpperCase(); // make it upper
        // System.out.println(firstup);
        String reshuoga = shuoga.replaceFirst(first,firstup); // replace it
        System.out.println("My name is " + reshuoga);


    }

// regular Expression
    public static class Mainpart132 {
        public static void main(String[] args) {
            String shuoga = "shuoga0426";
            System.out.println(shuoga.matches(".*[0-9]*")); // 任意文字n回後0-9n回と完全一致
            Pattern birthday = Pattern.compile(".*[0-9]*");
            Matcher M = birthday.matcher(shuoga);
            System.out.println(M.find());


        }
    }

}
