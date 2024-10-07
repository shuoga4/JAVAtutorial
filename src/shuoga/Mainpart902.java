package shuoga;

public class Mainpart902 {
    public static void main(String[] args) {
        boolean living = true;
        int age = 21;
        double randomage;
        int chance_of_death;

        while(living){
            System.out.println("u r living for now");
            randomage = Math.random() * 100;
            chance_of_death = (int)randomage;
            System.out.println(chance_of_death);
            if (chance_of_death >= 50) { // u can change number
                living = false;
                System.out.println("you are dead!");
            }

        }
    }
}
