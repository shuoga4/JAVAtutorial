package shuoga2;

import java.util.SplittableRandom;

public abstract class Human {
    private String name;
    private int health;
    private int atk;

    protected static int numberOfHuman = 0;

    Human(String name,int health,int atk) {
        this.name = name;
        this.health = health;
        this.atk = atk;
        numberOfHuman++;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAtk() {
        return this.atk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public abstract void useAbility();


    public void attack(Human human) {
        int hp = human.getHealth();
        hp = hp - this.atk;
        human.setHealth(hp);
    }
}
