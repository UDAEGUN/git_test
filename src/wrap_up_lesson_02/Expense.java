package wrap_up_lesson_02;

/**
 * 1回分の支出情報を表すクラス.
 */
public class Expense {
    private String category;
    private String comment;
    private int amount;

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
