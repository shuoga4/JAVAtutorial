package shuoga2;

public class Tank extends Human implements ITankable{
    Tank(String name, int health, int atk) {
        super(name, health, atk);
    }

    @Override
    public void useAbility() {
        System.out.println("tank tea");
        haunt();
    }

    public void heal (){
        int hp = super.getHealth();
        hp += 15;
        super.setHealth(hp);
    }

    @Override
    public void haunt() {
        System.out.println("look at me!");
    }
}
