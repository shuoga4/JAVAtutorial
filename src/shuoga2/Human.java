package shuoga2;

public class Human {
    private String name = "noname";
    private int health = 50;
    private int atk = 10;

    protected static int numberOfHuman = 0;

    Human() {
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


    public void attack(Human human) {
        int hp = human.getHealth();
        hp = hp - this.atk;
        human.setHealth(hp);
    }
}
