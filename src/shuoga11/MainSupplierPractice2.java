package shuoga11;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MainSupplierPractice2 {
    public static void main(String[] args) {
        final String charSet = "abcdefghijklmnopqrstuvwxyz";
        final int lengthRange = 10;
        final int listOfStr = 10;

        Supplier<String> randomStr = () -> {
            Random random = new Random();
            int actualLength = random.nextInt(lengthRange);
            String str = "";
            for (int i = 0; i < actualLength; i++) {
                char randomChar = charSet.charAt(random.nextInt(charSet.length()));
                str = str.concat(Character.toString(randomChar));
            }
            return str;
        };

        Stream<String> listStr = Stream.generate(randomStr);
        listStr.limit(listOfStr).forEach(str -> System.out.println("'" + str + "'"));

    }
}