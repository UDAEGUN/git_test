package java_basic_10;

import java.util.Scanner;

/**
 * メソッド　Activity.
 *
 * <p> ATM のような、銀行口座の入出金取引を実行するプログラムを作りましょう
 * <pre>
 *     目標 :
 *      1. 引数を使って、別のメソッドから渡された値を処理内で利用することができる
 *      2. 戻り値の使い方を理解し、返却された値を呼び出し元の処理で利用することができる
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        /* 標準入力用オブジェクト */
        Scanner sc = new Scanner(System.in);
        /* 利用種別　(0:お預入れ 1:お引き出し のいずれか) */
        int inputType;
        /* 預け入れ or 引き出し金額 */
        int inputAmount;

        //利用種別の入力を受け付ける
        System.out.print("ご利用種別を入力してください。　0:お預入れ 1:お引き出し\n>");
        inputType = sc.nextInt();

        //利用種別の入力内容チェック
        while (inputType != 0 && inputType != 1) {
            System.out.print("ご利用種別を正しく入力してください。　0:お預入れ 1:お引き出し\n>");
            inputType = sc.nextInt();
        }

        //預け入れ or 引き出し金額の入力を受け付ける
        System.out.print("ご利用金額を入力してください。\n>");
        inputAmount = sc.nextInt();

        //ToDo 3. 指示に従い、必要な処理を以下に記述してください
        BankAccountManager bankAccountManager = new BankAccountManager();

        if (inputType == 0) {
            bankAccountManager.deposit(inputAmount);
        } else {
            bankAccountManager.withdraw(inputAmount);
        }

    }


}
