public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        IShape  shape1 = factory.getShape("circle");
        IShape  shape2 = factory.getShape("rectangle");
        shape1.draw();
        shape2.draw();
    }
}