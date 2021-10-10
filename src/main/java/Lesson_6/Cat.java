package Lesson_6;

public class Cat extends Animal {
    static  int ObjectCat = 0;
    {
        ObjectCat += 1;
    }
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance){
        int maxDisRun = 200;
        if(distance <= maxDisRun){
            System.out.println(name + " пробежал " + distance);
        }else{
            System.out.println(name + " отказался, слишком далеко!");
        }
    }

    @Override
    public void swim(int distance){
            System.out.println(name + " не умеет плавать");
    }
}
