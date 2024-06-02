public class Quad extends Shape {
    public Quad(String name) {
        super(name);
    }

    @Override
    public void displayName() {
        System.out.println("Quad: " + name);
    }
}
