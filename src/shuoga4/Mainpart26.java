package shuoga4;

public class Mainpart26 {
    public static void main(String[] args) throws Exception {
        int x = 10;
        try{
            x = 100/0;
        } catch (Exception e) {
            System.out.println("exception!!  \"" +e.getMessage() + "\"");
        }

        System.out.println("hello");

        if(x > 100){
            throw new Exception("hel,lo");
        }

    }
}
