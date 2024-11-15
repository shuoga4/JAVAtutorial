package shuoga2;

public class Wizard extends Human{
    Wizard(String name, int health, int atk) {
        super(name, health, atk);
    }

    @Override
    public void useAbility() {
        System.out.println("wizzzz");
    }


}
