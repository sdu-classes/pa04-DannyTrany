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
