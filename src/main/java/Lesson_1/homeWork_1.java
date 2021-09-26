package Lesson_1;

public class homeWork_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    // Задание № 1
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание № 2
    public static void checkSumSing(){
        int a = 10;
        int b = 20;
        int c = a + b;

        if(c >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание № 3
    public static void printColor(){
        int value = 60;

        if(value <= 0){
            System.out.println("Красный");
        }else if(value > 0 && value <= 100){
            System.out.println("Жёлтый");
        }else{
            System.out.println("Зелёный");
        }
    }

    // Задание № 4
    public static void compareNumbers() {
        int a = 15;
        int b = 32;

        if(a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }
}

