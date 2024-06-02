public class Cuboid extends Shape {
    public Cuboid(String name) {
        super(name);
    }

    @Override
    public void displayName() {
        System.out.println("Cuboid: " + name);
    }
}
