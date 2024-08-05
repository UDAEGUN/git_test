package java_basic_14;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private String holderName;
    private List<String> paymentList = new ArrayList<>(); // 利用履歴
    private int point = 0;

    public CreditCard(String holderName) {
        this.holderName = holderName;
    }

    public void pay(String shopName, int amount) {
        if (amount <= 0) {
            System.out.println("利用金額が不正なため、決済を中止しました。");
            return;
        }

        paymentList.add("ご利用店舗 : " + shopName + "　ご利用金額 : " + amount);
        point += calcAddPoint(amount);

        System.out.println("決済完了");
    }

    public void printStatement() {
        System.out.println("\n-----------------------");
        System.out.println(holderName + "様の今月のご利用情報\n");

        for (String payment : paymentList) {
            System.out.println(payment);
        }

        System.out.println("\nポイント残高 : " + point);
        System.out.println("-----------------------");
    }

    protected int calcAddPoint(int amount) {
        return amount / 100;
    }
}
