package shuoga2;

public class Tank extends Human{
    Tank(String name, int health, int atk) {
        super(name, health, atk);
    }

    public void heal (){
        int hp = super.getHealth();
        hp += 15;
        super.setHealth(hp);
    }
}
