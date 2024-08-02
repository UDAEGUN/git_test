package java_basic_12;

/**
 * 個人を表すJavaBeans.
 */
public class PersonBean {

    /* 名前 */
    private String name;

    /* 年齢 */
    private int age;

    /**
     * 名前を取得し、返却するメソッド.
     *
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 年齢を取得し、返却するメソッド.
     *
     * @return 年齢
     */
    public int getAge() {
        return age;
    }

    /**
     * 引数を名前に設定するメソッド.
     *
     * @param name 名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 引数を年齢に設定するメソッド.
     *
     * @param age 年齢
     */
    public void setAge(int age) {
        this.age = age;
    }
}
