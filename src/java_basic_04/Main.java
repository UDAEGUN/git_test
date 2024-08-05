package java_basic_04;

import java.util.Scanner;

/**
 * 標準入力　Activity.
 *
 * <p> ユーザにいくつかの質問を投げかけ、回答を受け付けるアンケートプログラムを作成しましょう
 * <pre>
 *     目標 :
 *      1. さまざまな型の値を標準入力で受け付ける方法を身に着ける
 *      2. コンソール画面から値を入力し、対話型プログラムを操作できるようになる
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);

        //ToDo 1. 「1行分の文字列」を標準入力で受け付け、変数nameに代入してください
        System.out.print("名前 : "); String name = sc.next();

        //ToDo 2. 「整数」を標準入力で受け付け、変数ageに代入してください
        System.out.print("年齢 : "); int age = sc.nextInt();

        //ToDo 3. 「真偽値」を標準入力で受け付け、変数experienceに代入してください
        System.out.print("留学経験 : "); boolean experience = sc.nextBoolean();

        //ToDo 4. 以下の形式で上記3つの変数の値を標準出力してください
        System.out.println("お名前: " + name);
        System.out.println("年齢: " + age);
        System.out.println("留学経験: " + experience);
    }
}
