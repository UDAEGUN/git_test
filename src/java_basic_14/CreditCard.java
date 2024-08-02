package java_basic_14;

import java.util.ArrayList;
import java.util.List;

/**
 * クレジットカードを表すクラス.
 */
public class CreditCard {

    /* カード名義人名 */
    private String holderName;
    /* 利用履歴 */
    private List<String> paymentList = new ArrayList<>();
    /* ポイント残高 */
    private int point = 0;

    /**
     * コンストラクタ.
     *
     * @param holderName カード名義人名
     */
    public CreditCard(String holderName) {
        this.holderName = holderName;
    }

    /**
     * 指定された情報でクレジットカード決済を実行するメソッド.
     *
     * @param shopName 利用店舗名
     * @param amount   利用金額
     */
    public void pay(String shopName, int amount) {

        if (amount <= 0) {
            System.out.println("利用金額が不正なため、決済を中止しました。");
            return;
        }

        paymentList.add("ご利用店舗 : " + shopName + "　ご利用金額 : " + amount);
        point += calcAddPoint(amount);

        System.out.println("決済完了");

    }

    /**
     * 利用明細・現在のポイント残高を標準出力するメソッド.
     */
    public void printStatement() {

        System.out.println("\n-----------------------");
        System.out.println(holderName + "様の今月のご利用情報\n");

        for (String payment : paymentList) {
            System.out.println(payment);
        }

        System.out.println("\nポイント残高 : " + point);
        System.out.println("-----------------------");

    }

    /**
     * 今回の決済で付与されるポイント額を計算するメソッド.
     *
     * @param amount 利用金額
     * @return 追加されるポイント額
     */
    protected int calcAddPoint(int amount) {
        return amount / 100;
    }

}
