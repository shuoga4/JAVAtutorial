package shuoga2;

public class Hero extends Human{

    Hero(String name, int health, int atk) {
        super(name, health, atk);
    }

    public void burst(){
        int atk = super.getAtk();
        atk += 4;
        super.setAtk(atk);
    }

}
