package java_basic_15;

/**
 * 三角形を表すクラス.
 */
public class Triangle implements CalculableShape {

    /* 底辺 */
    private int base;
    /* 高さ */
    private int height;

    /**
     * コンストラクタ.
     *
     * @param base 底辺
     * @param height 高さ
     */
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    /**
     * この図形の面積を返すメソッド.
     *
     * @return 面積
     */
    @Override
    public int calculateArea() {
        return base * height / 2;
    }

}
