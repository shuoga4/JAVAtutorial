package shuoga5;

public class Mainpart25_2 {
    public static void main(String[] args) {

        Product camera = new Product("camera",100,ProductStatus.IN_STOCK);
        Product chips = new Product("chips",50,ProductStatus.IN_STOCK);
        Product sigar = new Product("sigar",150,ProductStatus.OUT_OF_STOCK);
        Product pc = new Product("pc",500,ProductStatus.DISCONTINUED);

        camera.printStatusMessage();
        chips.printStatusMessage();
        sigar.printStatusMessage();
        pc.printStatusMessage();
    }
}
