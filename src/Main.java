public class Main {
    /* ПЕРЕНЕСЛИ МЕТОД Person В КЛАСС -  Person
    public static Person createPerson(String name,int age){ //создаем метод
        Person person = new Person(); // Person - тип данных
        person.name=name;
        person.age=age;
        return person;
    }
     */

    public static void main(String[] args){
    System.out.println("Практика Создание Класса и Объекта");
    //вариант 1
    String nameJohn = "John";
    int ageJohn=13;
    String nameSarah = "Sarah";
    int ageSarah=30;
    //вариант 2 - создаем 2 массива с Именем и возрастом
    String[] names = {"John","Sarah"};
            int[] ages = {13,30};
    for (int i=0; i< names.length;i++){
        System.out.println("Имя - " + names[i] + " Возраст -" + ages[i]);
    }
    //Person sarah = new Person();  - Заменили на строчку ниже
        Person sarah = new Person("Sarah",30); // Указали явно адрес Класса перед методом createPerson и заменили
                                                          // на Person и затем Person.Person заменили на new Person

        //sarah.name = "Sarah"; заменили строчкой -  Person sarah = createPerson("Sarah",30);
        System.out.println("sarah.name = " + sarah.getName());
        //sarah.age = 30; аменили строчкой   - Person sarah = createPerson("Sarah",30);
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John",13);
    }
}