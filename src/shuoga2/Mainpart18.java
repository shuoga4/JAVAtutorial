package shuoga2;


// ヒューマンが百体いたらどうする？


public class Mainpart18 {
    public static void main(String[] args){

        Hero hero = new Hero("Hero", 50, 15);
        Tank tank = new Tank("Tank", 100, 8);

        System.out.println("Number of Human : " + Human.numberOfHuman);

        System.out.println("List : ");
        System.out.println(print(hero));
        System.out.println(print(tank));


        hero.attack(tank);
        System.out.println("List : \n    " + tank.getName() + " : " + tank.getHealth() + " hp, atk " + tank.getAtk());
        System.out.println("    " + hero.getName() + " : " + hero.getHealth() + " hp, atk " + hero.getAtk());

        hero.burst();
        tank.heal();
        System.out.println("List : \n    " + tank.getName() + " : " + tank.getHealth() + " hp, atk " + tank.getAtk());
        System.out.println("    " + hero.getName() + " : " + hero.getHealth() + " hp, atk " + hero.getAtk());



    }
    public static String print(Human human){
        return  human.getName() + " : " + human.getHealth() + " hp, atk " + human.getAtk();
    }

}
