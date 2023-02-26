package ProblemB;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }
    public void walk(){
        System.out.println("This animal walks on " + legs + " legs");
    }
    public abstract void eat();
}

class Spider extends Animal{

    public Spider(){
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider eats insects.");
    }
}

interface Pet {
    public String getName();
    public void setName(String name);
    void play();
}

class Cat extends Animal implements Pet {
    private String pet_name;

    public Cat(String name) {
        super(4);
        pet_name = name;
    }

    public Cat() {
        this("");
    }

    public void eat() {
        System.out.println("The cat eats food");
    }

    @Override
    public String getName() {
        return pet_name;
    }

    @Override
    public void setName(String name) {
        pet_name = name;
    }

    public void play() {
        System.out.println(pet_name + " plays with a ball");
    }
}

class Fish extends Animal{

    public Fish() {
        super(0);
    }
    @Override
    public void eat() {
        System.out.println("The fish eats fish food.");
    }
    @Override public void walk() {
        System.out.println("Fish can't walk!");
    }
}

class TestAnimals {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat("Mysyq");
        Animal animal = new Fish();
        Animal animal2 = new Spider();

        Pet p = new Cat();
        p.play();

        fish.eat();
        cat.eat();
        animal.walk();
        animal2.walk();
    }
}
