package java_basic_03.question_2;

import java.util.Random;

/**
 * 演算・文字列結合　Activity ②.
 *
 * <p> ある整数について、その値が既定の範囲内に収まっているか否かを判断するプログラムを作成しましょう
 * <pre>
 *     目標 :
 *      1. 関係演算子・論理演算子の使い方を理解し、条件に合致しているかを真偽値で表現できるようになる
 *      2. 文字列の結合方法を復習し、出力メッセージを自由に書けるようになる
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        //ToDo 1. 以下の条件に従って、2つの変数を初期化してください
        /*
         *  andFlag ... baseが「1以上 かつ 10未満」を表す式
         *  orFlag ... baseが「1未満 または 10以上」を表す式
         */
        int base = 3;
        boolean andFlag = 1 <= base && base < 10;
        boolean orFlag = base < 1 || 10 <= base;

        //ToDo 2. 以下の形式に従って、1で初期化したふたつの真偽値をそれぞれ標準出力してください
        /*
         *  andFlag ... 「base は1以上かつ10未満である: (andFlagの値)」
         *  orFlag ... 「base は1未満または10以上である: (orFlagの値)」
         *
         *  ※ ToDo1 の条件式がきちんと書けていれば
         * 　　andFlag は false, orFlag は true が出力される
         */
        System.out.println("base は1以上かつ10未満である: " + andFlag);
        System.out.println("base は1未満または10以上である: " + orFlag);

        /*
         *【発展】
         *  ToDo2 までを完了し、プログラムの実行結果を確認できたら、
         *  今度は変数 base の初期値を「10」以外の値に変更し、
         *  その値に応じて、出力結果が変わるのを確認してみましょう
         */
        base = new Random().nextInt(21) - 10;
        andFlag = 1 <= base && base < 10;
        orFlag = base < 1 || 10 <= base;
        System.out.println("\nbase は1以上かつ10未満である: " + andFlag);
        System.out.println("base は1未満または10以上である: " + orFlag);
    }
}
