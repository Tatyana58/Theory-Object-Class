public class Person {
    private String name;
    private int age;
    public Person(String name,int age){ //создаем метод, заменили createPerson на Person, удалили static Person
        //Person person = new Person(); // Person - тип данных и удалили строку
        //person.name=name; -заменили на строку ниже
        this.name=name;
        //person.age=age;заменили на строку ниже
        this.age=age;
        //return person;  //после удаления static Person удалили данную строку
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age=age;
    }

}
