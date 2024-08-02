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

        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);
        /* 乱数生成用オブジェクト */
        Random rand = new Random();
        /* じゃんけんの手を表す配列 */
        String[] hands = {"グー", "チョキ", "パー"};
        /* ユーザが入力した「じゃんけんをプレイする回数」を保持する変数 */
        int numOfMatch;
        /* ユーザが選んだ手を表す変数 (0:グー 1:チョキ 2:パー のいずれか) */
        int yourHand;
        /* コンピュータが選んだ手を表す変数 (0:グー 1:チョキ 2:パー のいずれか) */
        int comHand;

        System.out.print("何回勝負でゲームをはじめますか？\n>");
        numOfMatch = sc.nextInt();
        System.out.println("じゃんけんゲームを開始します");

        //ToDo 『ToDoList.txt』内の指示に従って、じゃんけんゲームを開発してください
        //ToDo1
        for (int i = 1; i <= numOfMatch; i++) {

            //ToDo2
            System.out.println("\n------------" + i + "回戦開始！------------\n");

            //ToDo3
            System.out.print("あなたが出す手を選んでください　0:グー 1:チョキ 2:パー\n>");
            yourHand = sc.nextInt();

            //ToDo4
            while (yourHand != 0 && yourHand != 1 && yourHand != 2) {
                System.out.print("出す手は次の選択肢の中から選んでください　0:グー 1:チョキ 2:パー\n>");
                yourHand = sc.nextInt();
            }

            //ToDo5
            comHand = rand.nextInt(3);

            //ToDo6
            System.out.println("あなたの手：" + hands[yourHand]);
            System.out.println("COM の手：" + hands[comHand]);

            //ToDo7
            if (yourHand == comHand) {
                System.out.println("あいこです");
            } else if (yourHand == 0 && comHand == 1 || yourHand == 1 && comHand == 2 || yourHand == 2 && comHand == 0) {
                System.out.println("あなたの勝ちです！");
            } else {
                System.out.println("あなたの負けです……");
            }

            //ToDo8
            System.out.println("\n------------" + i + "回戦終了！------------\n");

        }

        System.out.println("じゃんけんゲームを終了します…… またプレイしてね！");

    }

}
