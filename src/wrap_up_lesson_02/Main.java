package wrap_up_lesson_02;

import java.util.Scanner;

/**
 * まとめ　Activity (家計簿プログラム).
 *
 * <p> 支出情報の登録・確認ができる家計簿プログラムを作成しましょう
 * <pre>
 *     目標 :
 *      Java 基礎 ⑧ ～ ⑬ で学習した知識を組み合わせ、複数のクラスを使う複雑な対話型プログラムを完成させる
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isContinueAdd = true;
        boolean isContinueCheck = true;
        String input;
        String[] inputArray;    // ([0]:支出分類,[1]:概要,[2]:支出金額)

        //ToDo 1.
        HouseholdExpenses householdExpenses = new HouseholdExpenses();

        while (isContinueAdd) {
            System.out.println("\n追加する支出情報を次の形式で入力してください。　(支出分類),(概要),(支出金額)");
            System.out.print("Ex) 交際費,職場の飲み会,5000\n>");
            input = sc.nextLine();

            //ToDo 2.
            inputArray = input.split(",");

            if (inputArray.length == 3) {

                //ToDo 3.
                int amount = Integer.parseInt(inputArray[2]);

                //ToDo 4.
                householdExpenses.addExpense(inputArray[0], inputArray[1], amount);

                System.out.println("\nさらに情報を追加しますか？ 追加する場合は「yes」を入力してください。");
                System.out.print("その他の値が入力された場合は、追加処理を終了します。\n>");
                input = sc.nextLine();

                //ToDo 5.
                if (!"yes".equals(input)) {
                    isContinueAdd = false;
                }

            } else {
                System.out.println("\n入力の形式が間違っています。正しく入力し直してください。");
            }
        }

        //ToDo 6.
        householdExpenses.printSummary();

        while (isContinueCheck) {

            System.out.println("\n支出情報の一覧を確認したい支出分類を入力してください。");
            System.out.print("確認を終了する場合は「exit」と入力してください。\n>");
            input = sc.nextLine();

            //ToDo 7.
            if ("exit".equals(input)) {
                isContinueCheck = false;
            } else {
                householdExpenses.printApplicableExpenses(input);
            }
        }
    }
}
