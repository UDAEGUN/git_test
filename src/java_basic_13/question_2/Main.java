package java_basic_13.question_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 代表的な標準 API　Activity ②.
 *
 * <p> 宅配ピザの注文プログラムを作りましょう
 * <pre>
 *     目標 :
 *      1. Map の Key-Value 構造を理解し、プログラムの中で利用することができる
 *      2. コレクションの型には基本データ型が指定できないことを理解し、適切にラッパークラスを指定できる
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        
        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);
        /* 注文を続けるか管理するフラグ */
        boolean isContinue = true;
        /* ユーザからの入力内容を保持する変数 */
        String input;
        /* 注文の合計金額 */
        int amount = 0;

        //ToDo 1.
        Map<String, Integer> menuMap = new HashMap<>();
        //ToDo 2.
        menuMap.put("マルゲリータ", 2000);
        menuMap.put("ミックスピザ", 2500);
        menuMap.put("贅沢チーズピザ", 3000);
        menuMap.put("ポテト", 350);
        menuMap.put("ソフトドリンク", 150);

        while (isContinue) {

            System.out.println("\nご注文をどうぞ！");
            System.out.print("注文したい商品を入力してください。\n>");
            input = sc.nextLine();

            //ToDO 3.
            if (menuMap.containsKey(input)) {
                amount += menuMap.get(input);
            } else {
                System.out.println("そちらの商品は現在メニューにございません。");
            }

            System.out.println("\n他にご注文はございますか？");
            System.out.print("注文を続ける場合は「はい」を入力してください。　※ ない場合は Enter\n>");
            input = sc.nextLine();

            if (!"はい".equals(input)) {
                if (amount == 0) {
                    System.out.println("まだ何もご注文がありませんが……");
                } else {
                    isContinue = false;
                }
            }

        }

        System.out.println("\nお会計は合計で" + amount + "円です。30分以内にお届けします！");

    }

}
