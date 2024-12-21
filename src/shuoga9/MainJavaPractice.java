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

    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Product{name = '" + name + "'}";
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

    private double totalPrices(){
        Optional<Double> sum = cartItems.entrySet().stream()
                .map(a -> a.getKey().getPrice() * a.getValue())// double 掛け算！！！
                .reduce(Double::sum);
        return sum.orElse(0.0);
    }

    public void viewCart() {
        System.out.println("inside of cart is :");
        cartItems.forEach((key, value) -> System.out.println(" -" + key + " : " + value));
        System.out.println("-----------------------------------");
        System.out.println("Grand total : " + totalPrices() + "\n");
    }
}


public class MainJavaPractice {
    public static void main(String[] args) {
        Product apple = Product.createInstance("apple", 50.0, 50);
        Product orange = Product.createInstance("orange", 30.0,2);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(apple, 30);
        shoppingCart.addProduct(orange, 1);
        shoppingCart.viewCart();
        shoppingCart.removeProduct(apple,20);
        shoppingCart.removeProduct(orange,2);
        shoppingCart.viewCart();
    }
}
