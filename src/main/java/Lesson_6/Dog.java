package Lesson_6;

public class Dog extends Animal{
    static int ObjectDog = 0;
    {
        ObjectDog +=1;
    }

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void run(int distance){
        int maxDisRun = 500;
        if(distance <= maxDisRun){
            System.out.println(name + " пробежал " + distance);
        }else{
            System.out.println(name + " отказался, слишком далеко!");
        }
    }

    @Override
    public void swim(int distance) {
        int maxDisSwim = 10;
        if(distance <= maxDisSwim){
            System.out.println(name + " проплыл " + distance);
        }else{
            System.out.println(name + " отказался плыть, слишком далеко!");
        }
    }
}
