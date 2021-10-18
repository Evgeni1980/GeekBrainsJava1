package Lesson_6;

public class Animal {
    protected String name;

    public void run(int distance){
        System.out.println(name + " пробежал " + distance);
    }

    public void swim(int distance){
        System.out.println(name + " проплыл " + distance);
    }
        //Метод подсчёта котов, собак и животных
     static void animalCounter(){
        int sumAnimal = Dog.ObjectDog + Cat.ObjectCat;
        System.out.println("Созданных собак " + Dog.ObjectDog);
        System.out.println("Созданных котов " + Cat.ObjectCat);
        System.out.println("Всего животных " + sumAnimal);
    }

}


