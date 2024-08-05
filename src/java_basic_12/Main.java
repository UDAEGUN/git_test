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
    Scanner sc = new Scanner(System.in);


        //ToDo 3. ひとつめのPersonBean型インスタンス生成し、フィールドに標準入力した値を設定してください
        System.out.print("1人目の人物について、半角スペース区0切りで「名前」と「年齢」を入力してください。\n>");
        PersonBean personA = new PersonBean();

        personA.setName(sc.next());
        personA.setAge(sc.nextInt());


        //ToDo 4. ふたつめのPersonBean型のインスタンス生成し、フィールドに標準入力した値を設定してください
        System.out.print("2人目の人物について、半角スペース区切りで「名前」と「年齢」を入力してください。\n>");
        PersonBean personB = new PersonBean();

        personB.setName(sc.next());
        personB.setAge(sc.nextInt());

        //ToDo 5. 3. および 4. で設定した値を標準出力してください
        System.out.println("名前は" + personA.getName() + "です。");
        System.out.println("年齢は" + personA.getAge() + "歳です。");

        System.out.println("名前は" + personB.getName() + "です。");
        System.out.println("年齢は" + personB.getAge() + "歳です。");


        //ToDo 6. 3. で作成したインスタンスに別の値を設定し、設定した値を標準出力してください
        System.out.print("1人目の人物の情報を半角スペース区切りで「名前」と「年齢」を入力し、変更してください。\n>");
        personA.setName(sc.next());
        personA.setAge(sc.nextInt());

        //personA 出力処理
        System.out.println("名前は" + personA.getName() + "です。");
        System.out.println("年齢は" + personA.getAge() + "歳です。");
    }

}
