public class ShapeFactory {
    public IShape getShape(String shape) {
        if(shape == null) return null;
        switch (shape.toLowerCase()) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            default: return null;
        }
    }
}
