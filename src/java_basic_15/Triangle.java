package java_basic_15;


public class Triangle implements CalculableShape {
    private int base; // 底辺
    private int height; // 高さ

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return base * height / 2;
    }

}
