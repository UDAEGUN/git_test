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
        Scanner sc = new Scanner(System.in);

        //ToDo 3. ひとつめのインスタンス生成
        System.out.print("1. 名前、年齢 : ");
        Person person1 = new Person(sc.next(), sc.nextInt());

        System.out.print("2. 名前、年齢 : ");
        //ToDo 4. ふたつめのインスタンス生成
        Person person2 = new Person(sc.next(), sc.nextInt());

        //ToDo 5. 3. および 4. で生成したそれぞれのインスタンスから自己紹介メソッドを呼び出す
        person1.introduce();
        person2.introduce();

    }
}
