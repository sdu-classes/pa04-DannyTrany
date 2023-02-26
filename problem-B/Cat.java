package ProblemB;

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
