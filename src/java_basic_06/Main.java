package java_basic_06;

import java.util.Scanner;

/**
 * 配列　Activity.
 *
 * <p> 3つの整数を配列にして受け取り、それらを足し合わせた結果を表示するプログラムを作成しましょう
 * <pre>
 *     目標 :
 *      1. 配列を使うことで「ひとつの変数に複数の値を入れられる」という感覚を理解する
 *      2. 配列が持つ各要素について、値を出し入れする方法を覚える
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);

        System.out.print("任意の整数を3つ、半角スペース区切りで入力してください。\n>");

        //ToDo 1. 整数値型・要素数3個の配列を宣言し、標準入力から受け取った3つの整数を格納してください
        int[] array = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

//        //以下のように簡略化していない記述でもOK
//        int[] array = new int[3];
//        array[0] = sc.nextInt();
//        array[1] = sc.nextInt();
//        array[2] = sc.nextInt();

        //ToDo 2. 以下の形式に従い、配列内のすべての要素の値を足し合わせた結果を出力してください
        /*
         *  「3つの数の合計は (合計値)」
         */

        System.out.println("3つの数の合計は " + (array[0] + array[1] + array[2]));

    }

}
