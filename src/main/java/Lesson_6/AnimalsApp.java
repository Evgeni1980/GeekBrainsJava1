package Lesson_6;


import static Lesson_6.Animal.animalCounter;

public class AnimalsApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик");
        cat.run(200);
        cat.swim(5);

        Dog dog = new Dog("Бобик");
        dog.run(500);
        dog.swim(10);

        Dog dog1 = new Dog(" Дружок");
        Cat cat1 = new Cat("Васька");
        Dog dog2 = new Dog("Рекс");

        System.out.println();
        animalCounter();
    }


}
