package java_basic_14;

/**
 * ゴールドカードを表すクラス.
 */
public class GoldCard extends CreditCard {

    /**
     * コンストラクタ.
     *
     * @param holderName カード名義人名
     */
    public GoldCard(String holderName) {
        super(holderName);
    }

    @Override
    protected int calcAddPoint(int amount) {

        int point = super.calcAddPoint(amount) * 2;

        if (50000 <= amount) {
            point += 100;
        }

        return point;

    }

}
