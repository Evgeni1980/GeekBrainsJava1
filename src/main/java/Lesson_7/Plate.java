package Lesson_7;

public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int amount) {
        this.food -= amount;
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.printf("Plate [ Food: %d ]\n", food);
    }

        // Метод для добавления еды в тарелку.

    public void putFood(Cat cat){
        if (food < cat.getAppetite()){
            food = cat.getAppetite();
        }
        System.out.println("Добавили еду в тарелку");
    }
}
