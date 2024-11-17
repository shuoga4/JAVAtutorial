package shuoga2;

public class Hero extends Human implements ITankable{

    Hero(String name, int health, int atk) {
        super(name, health, atk);
    }

    @Override
    public void useAbility() {
        System.out.println("hero is here");
        haunt();
    }

    public void burst(){
        int atk = super.getAtk();
        atk += 4;
        super.setAtk(atk);
    }

    @Override
    public void haunt() {
        System.out.println("look at me!");
    }
}
