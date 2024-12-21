package shuoga10;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class MainSupplierPractice {
    public static void main(String[] args) {
        Supplier<LocalDateTime> now = LocalDateTime::now;
        System.out.println(now.get());
        Supplier<Integer> random = () -> {
            double a = Math.random() * 100;
            return (int) a;
        };

        for (int i = 0; i < 10; i++) {
            System.out.println(random.get());
        }
    }
}
