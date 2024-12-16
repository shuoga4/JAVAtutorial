package shuoga9;

import java.util.*;

class Product {
    private final String name;
    private final double price;
    private final int stock;

    private Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public static Product createInstance(String name, double price, int stock) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("不正な引数が入力されました : 名前");
        else if (price <= 0.0) throw new IllegalArgumentException("不正な引数が入力されました : 値段");
        else if (stock < 0) throw new IllegalArgumentException("不正な引数が入力されました : 在庫数");
        else return new Product(name, price, stock);
    }


}


public class MainJavaPractice {
}
