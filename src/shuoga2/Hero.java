package shuoga2;

public class Hero extends Human{

    Hero(String name, int health, int atk) {
        super(name, health, atk);
    }

    @Override
    public void useAbility() {
        System.out.println("hero is here");
    }

    public void burst(){
        int atk = super.getAtk();
        atk += 4;
        super.setAtk(atk);
    }

}
