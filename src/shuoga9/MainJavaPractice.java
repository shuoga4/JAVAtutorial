package shuoga9;

import java.util.*;
import java.util.stream.*;

class Product {
    private final String name;
    private final double price;
    private int stock;

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

    public void addStock(int amount) {
        this.stock += amount;
    }

    public void reduceStock(int amount) throws IllegalArgumentException {
        if (this.stock < amount) throw new IllegalArgumentException("不正な引数が入力されました : 在庫数切れ");
        else this.stock -= amount;
    }
}

class ShoppingCart {
    private Map<Product, Integer> cartItems;

    ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        product.reduceStock(quantity); // may throw exception
        // if quantity < stock
        cartItems.put(product, quantity);
    }

    public void removeProduct(Product product, int quantity) {
        if (cartItems.get(product) <= quantity) cartItems.remove(product);
        else cartItems.replace(product, cartItems.get(product) - quantity);
    }

    public void viewCart(){
        cartItems.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}


public class MainJavaPractice {
}
