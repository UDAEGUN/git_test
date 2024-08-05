package java_basic_07.question_1;

/**
 * 繰り返し　Activity ①.
 *
 * <p> 九九の9の段を計算するプログラムを、繰り返しを使って効率的に作成しましょう
 * <pre>
 *     目標 :
 *      for 文の構造を理解し、繰り返し処理を実現する方法を理解する
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        //ToDo 1. for 文を使って、以下の内容の標準出力を繰り返してください
        /*
         *  「9 × (1～9) = (計算結果)」の形式で標準出力を繰り返す
         *
         *  ※ 9 × 1 = 9
         *  　 9 × 2 = 18 ... と順番に出力すること
         */
        for (int i = 1; i < 10; i++) {
            System.out.printf("9 * %d = %d\n", i, 9 * i);
        }
    }
}
