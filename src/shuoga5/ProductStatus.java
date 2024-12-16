package shuoga5;

enum ProductStatus {
    IN_STOCK(true),
    OUT_OF_STOCK(false),
    DISCONTINUED(false);

    private final boolean isAvailable;

    ProductStatus(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


    public boolean isAvailable(){
        return isAvailable;
    }
}