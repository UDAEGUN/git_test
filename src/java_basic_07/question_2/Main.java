package java_basic_07.question_2;

/**
 * 繰り返し　Activity ②.
 *
 * <p> 配列として用意されている十二支を、拡張 for 文を使って順番に出力するプログラムを作成しましょう
 * <pre>
 *     目標 :
 *      拡張 for 文の書き方を理解し、効率的に配列を操作する方法を身に着ける
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        String[] zodiac = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

        //ToDo 1. 拡張 for 文を使って、上記の配列 zodiac が持つ要素を順番に出力してください
        /*
         *  「子」
         *  「丑」
         *  「寅」... と順番に1行ずつ出力
         */
        for (String s : zodiac) {
            System.out.println(s);
        }
    }
}
