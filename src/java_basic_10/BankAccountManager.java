package java_basic_10;

/**
 * 銀行口座の操作クラス.
 */
public class BankAccountManager {
    int balance = 150000;    // 口座残高

    // @param amount 入金額
    public void deposit(int amount) {
        if (isInvalidAmount(amount)) {
            return;
        }

        balance += amount;
        printReceipt("お預入れ", amount);
    }


    public void withdraw(int amount) {
        if (isInvalidAmount(amount)) {
            return;
        }
        if (balance < amount) {
            System.out.println("ご指定のお引き出し額に対して、残高が不足しています。");
            System.out.println("現在の残高: " + balance);
            return;
        }
        balance -= amount;
        printReceipt("お引き出し", amount);
    }

    // @param type   利用種別
    // @param amount 取り扱い金額
    public void printReceipt(String type, int amount) {
        System.out.println("\n-----------------------");
        System.out.println("ご利用ありがとうございました。\n");
        System.out.println("取引種別:" + type);
        System.out.println("お取扱額:" + amount);
        System.out.println("口座残高:" + balance);
        System.out.println("-----------------------\n");

    }

    // @param amount 取り扱い金額
    public boolean isInvalidAmount(int amount) {
        if (amount <= 0) {
            System.out.println("0円以下のお取り扱いはできません。");
            return true;
        }
        if (amount % 1000 != 0) {
            System.out.println("硬貨のお取り扱いはできません。");
            return true;
        }
        if (200000 < amount) {
            System.out.println("一度の取引における上限金額は20万円です。");
            return true;
        }
        return false;
    }
}
