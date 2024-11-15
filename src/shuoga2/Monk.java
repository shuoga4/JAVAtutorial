package shuoga2;

public class Monk extends Human{
    Monk(String name, int health, int atk) {
        super(name, health, atk);
    }

    @Override
    public void useAbility() {
        System.out.println("monk monk");
    }
}
