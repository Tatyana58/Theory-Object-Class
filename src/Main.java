public class Main {

    public static void main(String[] args) {
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
            System.out.println(" Имя - " + names[i] + " Возраст -" + ages[i]);
        }
        Person sarah = createPerson(" Sarah",30);
        System.out.println("sarah.name = " + sarah.name);
        System.out.println("sarah.age = " + sarah.age);
    }
}
