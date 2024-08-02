package java_basic_09;

import java.util.Scanner;

/**
 * フィールド　Activity.
 *
 * <p> 「個人」を表す1つのクラスから複数のインスタンスを生成して、それぞれに自己紹介させるプログラムを作りましょう
 * <pre>
 *     目標 :
 *      1. フィールドを使って、何らかの状態を表現することができる
 *      2. 引数ありコンストラクタを使って、フィールドを初期化することができる
 *      3. 各インスタンスが持つ状態によって、メソッドの振る舞いが変化する感覚を理解する
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);

        System.out.print("1人目の人物について、半角スペース区切りで「名前」と「年齢」を入力してください。\n>");
        //ToDo 3. ひとつめのインスタンス生成
        Person personA = new Person(sc.next(), sc.nextInt());

//        //以下のように一旦変数で受け取っても OK
//        String name = sc.next();
//        int age = sc.nextInt();
//        Person personA = new Person(name, age);

        System.out.print("2人目の人物について、半角スペース区切りで「名前」と「年齢」を入力してください。\n>");
        //ToDo 4. ふたつめのインスタンス生成
        Person personB = new Person(sc.next(), sc.nextInt());

        //ToDo 5. 3. および 4. で生成したそれぞれのインスタンスから自己紹介メソッドを呼び出す
        personA.introduce();
        personB.introduce();

    }

}
