package shuoga2;


// ヒューマンが百体いたらどうする？


public class Mainpart18 {
    public static void main(String[] args){

        Human hero = new Hero("Hero", 75, 15);
        Human tank = new Tank("Tank", 120, 9);
        Human monk = new Monk("Monk",50, 7);
        Human wizard = new Wizard("wizard",50,12);


        System.out.println("Number of Human : " + Human.numberOfHuman);
        System.out.println("--------------------");


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

        ((Hero) hero).haunt();



    }
    public static String print(Human human){
        return  human.getName() + " : " + human.getHealth() + " hp, atk " + human.getAtk();
    }

}
