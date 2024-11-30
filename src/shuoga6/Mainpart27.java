package shuoga6;

public class Mainpart27 {
    public static void main(String[] args) {
        Block block = new Block("general block");
        StoneBlock stoneBlock = new StoneBlock("stone");
        WoodBlock woodBlock = new WoodBlock("wood");

        BlockStorage<Block> blockStorage = new BlockStorage<>();

        blockStorage.addBlock(block);
        blockStorage.addBlock(stoneBlock);
        blockStorage.addBlock(woodBlock);
        blockStorage.addBlock(new HalfWoodBlock());

        blockStorage.displayBlocks();

        BlockStorage<WoodBlock> woodBlockStorage = new BlockStorage<>();
        woodBlockStorage.addBlock(new WoodBlock("wood"));
        woodBlockStorage.addBlock(new WoodBlock("wood"));
        woodBlockStorage.addBlock(new WoodBlock("wood"));
        woodBlockStorage.addBlock(new HalfWoodBlock());






    }
}
