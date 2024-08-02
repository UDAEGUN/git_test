package java_basic_02;

/**
 * 変数・よく使う型　Activity.
 *
 * <p> よく使われる3つの型を用いて、プログラムの中で変数を使いこなしてみましょう
 * <pre>
 *     目標 : 
 *      1. 講義資料で取り上げた3つの「よく使われる型」の用途を覚える
 *      2. 変数の宣言・初期化の書き方を理解し、変数を利用できるようになる
 *      3. 代入によって変数が持つ値が変化し、代入の前後で参照結果が変わることを理解する
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        //ToDo 1. 整数型・真偽値型・文字列型の変数をひとつずつ宣言し、任意の値で初期化してください
        int intValue=3;
        boolean booleanValue= true;
        String stringValue = "hoge";
        System.out.println("--------初期化が完了--------");

        //ToDo 2. 1で初期化した変数の値を標準出力してください
        System.out.println(intValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);

        //ToDo 3. 1で初期化した変数に、もともと入っていたのとは違う値を代入してください
        intValue = 1;
        booleanValue = false;
        stringValue = "piyo";
        System.out.println("---------代入が完了---------");

        //ToDo 4. 1で初期化した変数をもう一度出力し、2とは出力結果が変わるのを確認してください
        System.out.println(intValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);

    }

}
