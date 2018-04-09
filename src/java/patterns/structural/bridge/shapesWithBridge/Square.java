package patterns.structural.bridge.shapesWithBridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }
}