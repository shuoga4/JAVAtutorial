package shuoga6;

public class Mainpart27 {
    public static void main(String[] args) {
        Block block = new Block("hi");
        System.out.println(block.toString());
        System.out.println(block.hashCode());

        BlockStorage<Block> blockStorage = new BlockStorage<>();
        blockStorage.addBlock(block);
        blockStorage.displayBlocks();



    }
}
