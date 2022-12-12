public class Person {
    String name;
    int age;
    public static Person Person(String name,int age) {
        Person person = new Person();
        person.name = name;
        person.age = age;
        return person;
    }
}
