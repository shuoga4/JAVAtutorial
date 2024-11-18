package shuoga2;




import java.util.ArrayList;
import java.util.List;

public class Mainpart18 {
    public static void main(String[] args){

        Human hero = new Hero("Hero", 75, 15);
        Human tank = new Tank("Tank", 120, 9);
        Human monk = new Monk("Monk",50, 7);
        Human wizard = new Wizard("wizard",50,12);
        ITankable tankable = new ITankable() {
            @Override
            public void haunt() {
                System.out.println("tank in convenient way!");
            }
        };

        Human archer = new Human("archer", 60 , 10) {
            @Override
            public void useAbility() {
                System.out.println("use this pretty freaking cool bow!");
            }


        };


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
        humans.add(archer);

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
