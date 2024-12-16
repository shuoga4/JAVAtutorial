package shuoga5;

class Product {
    private String name;
    private int price;
    private ProductStatus status;

    Product(String name,int price,ProductStatus status){
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public void printStatusMessage(){
        if(status == ProductStatus.IN_STOCK){
            System.out.println(name + "は在庫があります、価格は" + price + "円です");
        }else if (status == ProductStatus.OUT_OF_STOCK){
            System.out.println(name + "は現在在庫切れです");
        }else if (status == ProductStatus.DISCONTINUED){
            System.out.println(name + "は販売を終了しました");
        }else {
            System.out.println("err");
        }
    }
}
