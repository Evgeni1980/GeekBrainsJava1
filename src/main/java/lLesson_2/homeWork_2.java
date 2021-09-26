package lLesson_2;

public class homeWork_2 {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 20));
        isPositiveOrNegative(5);
        System.out.println(isNegative(-15));
        printWordNTimes("Hello world", 5);
        System.out.println(leapYear(2021));
        System.out.println(leapYear1(2021));
    }
        // Задание № 1
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
        // Задание № 2
    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное.");
        } else {
            System.out.println("Число " + a + " отрицательное.");
        }
    }
        // Задание № 3
    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }
        // Задание № 4
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
        // Задание № 5
    public static boolean leapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }
        // Задание № 5 с if
    public static boolean leapYear1(int year){
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
