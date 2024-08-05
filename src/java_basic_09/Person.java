package java_basic_09;


public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.printf("%s (%d才)", name, age);
    }
}
