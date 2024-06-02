public class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }

    @Override
    public void displayName() {
        System.out.println("Circle: " + name);
    }
}