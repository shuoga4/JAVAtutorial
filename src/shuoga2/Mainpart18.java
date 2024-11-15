package shuoga2;


// ヒューマンが百体いたらどうする？


public class Mainpart18 {
    public static void main(String[] args){

        Hero hero = new Hero("Hero", 75, 15);
        Tank tank = new Tank("Tank", 120, 9);
        Monk monk = new Monk("Monk",50, 7);
        Wizard wizard = new Wizard("wizard",50,12);


        System.out.println("Number of Human : " + Human.numberOfHuman);
        System.out.println("--------------------");


        System.out.println(print(hero));
        System.out.println(print(tank));
        System.out.println(print(monk));
        System.out.println(print(wizard));
        System.out.println("--------------------");


        hero.attack(tank);
        System.out.println(print(hero));
        System.out.println(print(tank));
        System.out.println(print(monk));
        System.out.println(print(wizard));
        System.out.println("--------------------");


        hero.burst();
        tank.heal();
        System.out.println(print(hero));
        System.out.println(print(tank));
        System.out.println(print(monk));
        System.out.println(print(wizard));
        System.out.println("--------------------");


        hero.useAbility();
        tank.useAbility();
        monk.useAbility();
        wizard.useAbility();
        System.out.println("--------------------");




    }
    public static String print(Human human){
        return  human.getName() + " : " + human.getHealth() + " hp, atk " + human.getAtk();
    }

}
