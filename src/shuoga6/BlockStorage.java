package shuoga6;

import java.util.*;

public class BlockStorage <T extends Block>{
    private List<T> blocks;

    public BlockStorage(){
        this.blocks = new ArrayList<>();
    }
    // これで、ストレージがクラフトされるたび、ひとつのblockのリストができる
    // さらに、コンストラクタでインスタンス化し、他メソッドでリストがつかえる。
    // ただし、このストレージはなにか特定のブロックに対して、その単体のブロックストレージなんだと思う。
    // 追加
    // ブロックで<Block>ってすればすべてのブロックを親クラスにもつブロックは入る

    public void addBlock(T block){
        blocks.add(block);
        System.out.println(block + " -> added to your storage");
    }

    public void displayBlocks(){
        System.out.println("Block in your storage: ");
        for(T block : blocks){
            System.out.println("- " + block.toString());
        }
    }

}
