package shuoga;


    // https://qiita.com/o65nakashima/items/182bba3bf49d166348f9

class Name {
    public final String first, last, middle, full;

    Name(String first, String last) {
        this(first, "", last);
    }

    Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle == null ? "" : middle;
        this.last = last;
        this.full = first + " " + (middle.isEmpty() ? "" : middle + " ") + last;
    }
}

class Health {
    public double height, weight;

    public void update(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double bmi() {
        return weight / height / height;
    }

    public boolean isHealthy() {
        return 18.5 <= bmi() && bmi() < 25.0;
    }
}



class Person {
    public final Name name;
    public int age;
    public final Health health;

    Person(String firstName, String lastName, int age) {
        this(firstName, "", lastName, age);
    }

    Person(String firstName, String middleName, String lastName, int age) {
        this.name = new Name(firstName, middleName, lastName);
        this.age = age;
        this.health = new Health();
    }

    void updateHealth(double height, double weight) {
        health.update(height, weight);
    }

}



public class MainForClass {
    public void main(String[] args) {
        Person kate = new Person("Kate", "Jones", 27);
        Person john = new Person("John", "Christopher", "Smith", 65);

        kate.updateHealth(1.6, 50.0);
        john.updateHealth(1.75, 80.0);

        printData(kate);
        printData(john);
    }



    public static void printData(Person person) {
        System.out.println("name : " + person.name.full + "");
        System.out.println("age : " + person.age + "");
        System.out.println("height : " + person.health.height + "m");
        System.out.println("weight : " + person.health.weight + "kg");

        System.out.println("BMI : " + person.health.bmi() + "");

        if (person.health.isHealthy()) {
            System.out.println("-> normal\n");
        } else {
            System.out.println("-> abnormal\n");
        }
    }
}

