package java_basic_15;

/**
 * 長方形を表すクラス.
 */
public class Rectangle implements CalculableShape {

    /* 縦(高さ) */
    private int height;
    /* 横(幅) */
    private int width;

    /**
     * 縦(高さ)の Getter.
     *
     * @return 縦(高さ)
     */
    public int getHeight() {
        return height;
    }

    /**
     * 縦(高さ)の Setter.
     *
     * @param height 縦(高さ)
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 横(幅)の Getter.
     *
     * @return 横(幅)
     */
    public int getWidth() {
        return width;
    }

    /**
     * 横(幅)の Setter.
     *
     * @param width 横(幅)
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * この図形の面積を返すメソッド.
     *
     * @return 面積
     */
    @Override
    public int calculateArea() {
        return height * width;
    }

}
