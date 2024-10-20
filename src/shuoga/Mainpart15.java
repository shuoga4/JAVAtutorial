package shuoga;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mainpart15 {
    public static void main(String[] args) {
        //判定する文字列
        String str = "012-345-6789";
        //判定するパターンを生成
        // Pattern p = Pattern.compile("\\d{2,4}-\\d{2,4}-\\d{4}"); //電話番号
        Pattern p = Pattern.compile("^\\d{3}-\\d{4}$"); //郵便番号
        Matcher m = p.matcher(str);

        System.out.println(m.find()); //true
    }
}
