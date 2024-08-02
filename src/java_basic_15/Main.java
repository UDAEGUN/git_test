package java_basic_15;

/**
 * インタフェース　Activity.
 *
 * <p> 三角形と長方形を表すそれぞれのクラスに、面積を計算するメソッドを持たせる制約を作りましょう
 * <pre>
 *     目標 :
 *      1. インタフェースの作成・実装の方法を理解し、プログラムの中で利用できる
 *      2.「実装に依存せずに制約を持たせる」という、継承と比較したメリットを理解している
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        //三角形のインスタンス生成
        Triangle triangle = new Triangle(4, 5);

        //長方形のインスタンス生成・初期値設定
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(5);

        //ToDo 3.
        CalculableShape shape = triangle;
//        CalculableShape shape = rectangle;

        //ToDo 4.
        System.out.println("この図形の面積は" + shape.calculateArea() + "です！");

    }

}
