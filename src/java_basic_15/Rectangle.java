package java_basic_15;


public class Rectangle implements CalculableShape {
    private int height; // 縦(高さ)
    private int width; // 横(幅)

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return height * width;
    }
}
