package shuoga7;

import java.util.function.Function;

public class Mainpart28 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                helloWorld();
            }
        };

        Runnable runnable1 = () -> System.out.println("hello!");
        runAnything(runnable);
        runAnything(runnable1);

        System.out.println("------------------------------------------");

        Function<String, String> hello = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "hello! : " + s;
            }
        };

        Function<String,String> hello2 = (x) -> "hello2 : " + x;

        System.out.println(hello.apply("aloe"));
        System.out.println(hello2.apply("aloe2"));

        System.out.println("------------------------------------------");

        //runnableは、パラメータなしでもいいこと、ラムダ式の処理部分が実行形式なこと
        //Functionは、引数の型と戻り値の型の指定をすること、パラメータ必須なこと、処理は戻り値を書くこと
        //定義そのままじゃん、ラナブル＝実行可能、ファンクション＝関数＝xいれてyだす


    }
    public static void helloWorld(){
        System.out.println("hello");
    }

    public static void runAnything(Runnable runnable){
        runnable.run();
    }

}
