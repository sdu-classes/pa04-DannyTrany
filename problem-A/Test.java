package ProblemA;

public class Test {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(2, 6, 3, 3);
        p.moveUp();
        System.out.println(p);
        MovableCircle c = new MovableCircle(7, 4, 2, 5, 6);
        c.moveLeft();
        System.out.println(c);
    }
}
