package java_basic_13.question_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 代表的な標準 API　Activity ①.
 *
 * <p> 入力されたテキストから全角・半角スペースを除去し、除去済みのテキストを一覧表示するプログラムを作りましょう
 * <pre>
 *     目標 :
 *      1. List をプログラムの中で利用でき、配列との違いが説明できる
 *      2. String クラスが持つメソッドを活用することができる
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);
        /* テキストの入力を続けるか管理するフラグ */
        boolean isContinue = true;
        /* ユーザからの入力内容を保持する変数 */
        String input;
        //ToDo 1.
        List<String> textList = new ArrayList<>();


        while (isContinue) {

            System.out.print("テキストを入力してください。\n>");
            input = sc.nextLine();

            //ToDo 2.
            input = input.replaceAll("　", "").replaceAll(" ", "");
            //ToDo 3.
            textList.add(input);

            System.out.println("\nさらにテキストを追加しますか？");
            System.out.print("追加する場合は「yes」を入力してください。　※ 追加しない場合は Enter\n>");
            input = sc.nextLine();

            //ToDo 4.
            if (!"yes".equals(input)) {
                isContinue = false;
            }

        }

        //ToDo 5.
        System.out.println("\n" + textList.size() + "件のテキストが入力されました。");

        //ToDo 6.
        for (String text : textList) {
            System.out.println(text);
        }

    }

}
