package shuoga2;

class Human{
    private String name = "noname";
    private int health = 50;
    protected int atk = 10;

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getAtk(){
        return this.atk;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setAtk(int atk){
        this.atk = atk;
    }


    public void attack(Human human){
        int hp = human.getHealth();
        hp = hp - this.atk;
        human.setHealth(hp);
    }
}

class Hero extends Human{
    public void setAtk(int atk) {
        super.setAtk(atk);
    }
}

class Tank extends Human{
    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }
}




// require:
// input class
// what is protected


public class Mainpart18 {
}
