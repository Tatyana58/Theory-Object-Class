public class Main {
    /* ПЕРЕНЕСЛИ МЕТОД Person В КЛАСС -  Person
    public static Person createPerson(String name,int age){ //создаем метод
        Person person = new Person(); // Person - тип данных
        person.name=name;
        person.age=age;
        return person;
    }
     */
        public static void main(String[] args) {
        System.out.println("Практика Создание Класса и Объекта");
        //Person sarah = new Person();  - Заменили на строчку ниже
        PersonService personService=new PersonService();
        Person sarah = new Person("Sarah", 30); // Указали явно адрес Класса перед методом createPerson и заменили
        // на Person и затем Person.Person заменили на new Person

            if(personService.isAdult(sarah)){
                System.out.println(" Иди в бар");
            } else {
                System.out.println(" Иди в школу");
            }
            System.out.println(sarah);
            sarah.increaseAge(1);;
            System.out.println(sarah);
            //sarah.name = "Sarah"; заменили строчкой -  Person sarah = createPerson("Sarah",30);
        //System.out.println("sarah.name = " + sarah.getName());
        //sarah.age = 30; аменили строчкой   - Person sarah = createPerson("Sarah",30);
        //System.out.println("sarah.age = " + sarah.getAge());
        //sarah.setAge(31);
        //System.out.println("sarah.getAge() = " + sarah.getAge());
        //Person john = new Person("John", 13);


    }
}