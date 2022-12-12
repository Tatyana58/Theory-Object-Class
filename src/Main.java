public class Main {
    public static void main(String[] args) {
        System.out.println("Практика Создание Класса и Объекта");
        Person sarah = new Person(" Sarah",30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john=new Person( "John",13);
        System.out.println("Имя: " + john.getName()+" Возраст: " + john.getAge());
    }
}
