package shuoga2;


// require:
// what is protected


public class Mainpart18 {
    public static void main(String[] args){

        Human hero = new Human();
        Human tank = new Human();
        tank.setName("tank");
        hero.setName("hero");
        System.out.println("Number of Human : " + Human.numberOfHuman);
        System.out.println("List : \n    " + hero.getName() + " : " + hero.getHealth() + "hp, atk" + hero.getAtk());
        System.out.println("    " + tank.getName() + " : " + tank.getHealth() + "hp, atk" + tank.getAtk());

        hero.attack(tank);
        System.out.println("List : \n    " + tank.getName() + " : " + tank.getHealth() + "hp, atk" + tank.getAtk());
        System.out.println("    " + hero.getName() + " : " + hero.getHealth() + "hp, atk" + hero.getAtk());


    }
}
