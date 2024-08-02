package java_basic_05;

import java.util.Scanner;

/**
 * 条件分岐　Activity.
 *
 * <p> 入力されたテストの点数に応じて、「優」「良」などの成績をつけるプログラムを作成しましょう
 * <pre>
 *     目標 :
 *      1. if・else if・else を使って、条件に応じて処理内容を分岐させる方法を学ぶ
 *      2. すでに学習した関係演算子・論理演算子を使って、適切に条件式を書くことができるようになる
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);

        /* ユーザが入力したテストの点数を受け取る */
        System.out.print("テストの点数を「0～100」の範囲で入力してください。\n>");
        int score = sc.nextInt();

        //ToDo 1. 変数「score」の値に応じて、以下のルールに従って判定結果を出力してください
        /*
         * ・0～100点の範囲外 …… 「点数は0～100点の範囲で入力してください。」
         * ・90点以上 …… 「優」
         * ・70点以上(90点未満) …… 「良」
         * ・50点以上(70点未満) …… 「可」
         * ・50点未満 …… 「不可」
         */
        if (score < 0 || 100 < score) {
            System.out.println("点数は0～100点の範囲で入力してください。");
        } else if (90 <= score) {
            System.out.println("優");
        } else if (70 <= score) {
            System.out.println("良");
        } else if (50 <= score) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

        }




}
