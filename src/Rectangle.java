public class Rectangle extends Shape {
    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void displayName() {
        System.out.println("Rectangle: " + name);
    }
}
