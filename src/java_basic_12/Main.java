package java_basic_12;

import java.util.Scanner;

/**
 * JavaBeans　Activity.
 *
 * <p> 「個人を表すJavaBeans」から複数のインスタンスを生成して、それぞれに自己紹介させるプログラムを作りましょう
 * <pre>
 *     目標 :
 *      1. JavaBeansの基本的な書き方を理解する
 *      2. Getter,Setterを使って、データを出し入れする感覚を理解する
 * </pre>
 */

public class Main {

    public static void main(String[] args) {

        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);

        System.out.print("1人目の人物について、半角スペース区切りで「名前」と「年齢」を入力してください。\n>");

        //ToDo 3. ひとつめのPersonBean型インスタンス生成し、フィールドに標準入力した値を設定してください
        //・標準入力で文字列（名前）と整数（年齢）を受け取り、
        //受け取った値をSetterを使ってフィールドに設定する
        PersonBean personA = new PersonBean();

        personA.setName(sc.next());
        personA.setAge(sc.nextInt());

        System.out.print("2人目の人物について、半角スペース区切りで「名前」と「年齢」を入力してください。\n>");

        //ToDo 4. ふたつめのPersonBean型のインスタンス生成し、フィールドに標準入力した値を設定してください
        PersonBean personB = new PersonBean();

        personB.setName(sc.next());
        personB.setAge(sc.nextInt());

        //ToDo 5. 3. および 4. で設定した値を標準出力してください
        //処理内容：「名前は (名前）です。」
        //　　　　　「年齢は（年齢）歳です。」と標準出力する。

        //personA 出力処理
        System.out.println("名前は" + personA.getName() + "です。");
        System.out.println("年齢は" + personA.getAge() + "歳です。");

        //personB 出力処理
        System.out.println("名前は" + personB.getName() + "です。");
        System.out.println("年齢は" + personB.getAge() + "歳です。");

        System.out.print("1人目の人物の情報を半角スペース区切りで「名前」と「年齢」を入力し、変更してください。\n>");

        //ToDo 6. 3. で作成したインスタンスに別の値を設定し、設定した値を標準出力してください
        //・同じように標準入力で文字列（名前）と整数（年齢）を受け取り設定した内容を変更して標準出力しましょう
        personA.setName(sc.next());
        personA.setAge(sc.nextInt());

        //personA 出力処理
        System.out.println("名前は" + personA.getName() + "です。");
        System.out.println("年齢は" + personA.getAge() + "歳です。");
    }

}
