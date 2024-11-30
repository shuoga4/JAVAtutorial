package shuoga6;

public class Block {
    private String type;

    public Block(String type){
        this.type = type;
    }


    @Override
    public String toString() {
        return type;
    }
}
