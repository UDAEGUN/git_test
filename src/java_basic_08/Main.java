package java_basic_08;

/**
 * クラスの自作・利用　Activity.
 *
 * <p> 複数のクラスを使ったプログラミングの第一歩として、別のクラスのメソッドを呼び出してみましょう
 * <pre>
 *     目標 :
 *      1. コンストラクタを使って、別のクラスのインスタンスを生成できる
 *      2. 生成したインスタンスを通して、メソッドを呼び出すことができる
 *      3. 別のクラスのメソッドを実行した後、呼び出し元に処理が戻る流れを理解する
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("それでは、別のクラスのメソッドを呼び出してみましょう！");

        //ToDo 3. の指示に従って、この行の下に必要な処理を記述してください
        MyFirstClass myInstance = new MyFirstClass();
        myInstance.sayHello();

        System.out.println("無事呼び出すことができました！");

    }

}
