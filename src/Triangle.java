public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public void displayName() {
        System.out.println("Triangle: " + name);
    }
}