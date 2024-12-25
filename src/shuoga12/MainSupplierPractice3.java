package shuoga12;

import java.util.*;
import java.util.function.Supplier;

public class MainSupplierPractice3 {
    public static void main(String[] args) {
        Supplier<String> getName = () -> "Alice";
        Supplier<Integer> getAge = () -> 44;

        Supplier<String> getInfo = () -> "Name: " + getName.get() + ", Age: " + getAge.get();

        System.out.println(getInfo.get());
    }


}
