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
        System.out.print("あなたの名前を教えてください。\n>");
        String name = sc.nextLine();

        //ToDo 2. 「整数」を標準入力で受け付け、変数ageに代入してください
        System.out.print("あなたの年齢を教えてください。\n>");
        int age = sc.nextInt();

        //ToDo 3. 「真偽値」を標準入力で受け付け、変数experienceに代入してください
        System.out.print("プログラミング経験の有無を true or false で教えてください。\n>");
        boolean experience = sc.nextBoolean();

        System.out.println("----------------------------");
        System.out.println("アンケートへのご回答、ありがとうございました。");

        //ToDo 4. 以下の形式で上記3つの変数の値を標準出力してください
        /*
         *  name ... 「お名前: (nameの値) 」
         *  age ... 「年齢: (ageの値)」
         *  experience ... 「プログラミング経験有フラグ: (experienceの値)」
         */
        System.out.println("お名前: " + name);
        System.out.println("年齢: " + age);
        System.out.println("プログラミング経験有フラグ: " + experience);

    }

}
