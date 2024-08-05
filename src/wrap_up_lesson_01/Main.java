package wrap_up_lesson_01;

import java.util.Random;
import java.util.Scanner;

/**
 * まとめ　Activity (じゃんけんゲーム).
 *
 * <p> コンピュータとじゃんけんで対決するゲームを作成しましょう
 * <pre>
 *     目標 :
 *      Java 基礎 ① ～ ⑦ で学習した知識を組み合わせ、これまでより複雑な対話型プログラムを完成させる
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String[] arr = { "グー", "チョキ", "パー" };

        System.out.print("プレイ回数 : ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int bot = ran.nextInt(3);

            System.out.println(i + 1 + "回戦\nグー(1), チョキ(2), パー(3) : ");
            int user = sc.nextInt() - 1;
            while (user != 0 && user != 1 && user != 2) {
                System.out.print("もう一度入力してください\n\nグー(1), チョキ(2), パー(3) : ");
                user = sc.nextInt() - 1;
            }

            System.out.printf("AI : %s, ユーザー : %s\n", arr[bot], arr[user]);

            String msg = "あいこです\n\n";
            if (bot == 0 && user == 2 || bot == 1 && user == 0 || bot == 2 && user == 1) msg = "勝ちです\n\n";
            else if (bot == 0 && user == 1 || bot == 1 && user == 2 || bot == 2 && user == 0) msg = "負けです\n\n";
            System.out.print(msg);
        }
        sc.close();
    }
}
