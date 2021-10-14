package Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;
    private boolean isSatiety;

    public Cat(String name){
        this.name = name;
        this.appetite = 15;
        this.isSatiety = false;
    }

    public boolean getSatiety() {
        return isSatiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info(){
        System.out.println("Сытость : " + name + " " + isSatiety);
    }

    public void eat(Plate plate){
        plate.decreaseFood(appetite);
        isSatiety = true;
//        System.out.println(name + " поел из тарелки");
    }

}
