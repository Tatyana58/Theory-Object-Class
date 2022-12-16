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
    public boolean isAdult(){
    return this.getAge()>18;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if (age<this.age) {
            throw new IllegalArgumentException("Новый возраст меньше, чем текущий");
        }
        if (age<0){
            throw  new IllegalArgumentException("Возраст не может быть отрицательным ");
        }
        this.age=age;
    }
    public String toString() {
        // Добавляем метод toString()
        return "Имя " + this.name + " Возраст " + this.age;
        // Возвращаем строку в метод Main
    }
}
