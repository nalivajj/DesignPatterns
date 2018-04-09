package patterns.structural.bridge.shapesWithBridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }
}