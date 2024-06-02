public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle 1");
        Quad quad = new Quad("Quad 1");
        Triangle triangle = new Triangle("Triangle 1");

        ShapePrinter.printShapeName(circle);
        ShapePrinter.printShapeName(quad);
        ShapePrinter.printShapeName(triangle);
    }
}