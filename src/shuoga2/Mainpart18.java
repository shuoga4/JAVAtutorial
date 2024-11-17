package shuoga2;


// ヒューマンが百体いたらどうする？


import java.util.ArrayList;
import java.util.List;

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






        ((Hero) hero).haunt();
        System.out.println("--------------------");

        List<Human> humans = new ArrayList<>();
        humans.add(hero);
        humans.add(tank);
        humans.add(monk);
        humans.add(wizard);

        for(Human human : humans){
            human.useAbility();
        }

        System.out.println("--------------------");
        List<ITankable> tankables = new ArrayList<>();
        tankables.add((ITankable) tank);
        tankables.add(new Hero("hero2",50,15));

        for(ITankable tankable : tankables){
            tankable.haunt();
        }


    }
    public static String print(Human human){
        return  human.getName() + " : " + human.getHealth() + " hp, atk " + human.getAtk();
    }

}
