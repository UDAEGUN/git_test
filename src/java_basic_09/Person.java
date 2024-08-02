package java_basic_09;

/**
 * 個人を表すクラス.
 */
public class Person {

    /* 名前 */
    String name;
    /* 年齢 */
    int age;


    /**
     * 個人名と年齢を引数に取るコンストラクタ.
     *
     * @param name 名前
     * @param age  年齢
     */
    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

    /**
     * 自己紹介文(名前と現在の年齢)を標準出力するメソッド.
     */
    public void introduce() {

        System.out.println("\n私の名前は" + name + "です。年齢は" + age + "歳です。");

    }

}
