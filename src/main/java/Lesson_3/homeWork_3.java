package Lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class homeWork_3 {
    public static void main(String[] args) {
        System.out.println("Задание № 1.");
        invertArray(0,1,0,0,1);
        System.out.println();

        System.out.println("Задание № 2.");
        fillArray(new int[100]);
        System.out.println();

        System.out.println("Задание № 3.");
        changeArray(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1);
        System.out.println();

        System.out.println("Задание № 4.");
        fillDiagonal(new int[5][5]);
        System.out.println();

        System.out.println("Задание № 5.");
        inputScanner();
        System.out.println();

        System.out.println("Задание № 6.");
        minMaxMeaning(9, 5, 7, 2, 4);
        System.out.println();

        System.out.println("Задание № 7.");
        sumArray();
        System.out.println("Результат проверки - " + checkBalance(2, 2, 2, 1, 2, 2, 10, 1));

    }

    //Задание № 1
    public static void invertArray(int... arr){
        System.out.println(Arrays.toString(arr) + " До замены.");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr) + " После замены.");
    }

    // Задание № 2
    public static void fillArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание №3
    public static void changeArray(int... arr){
//        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr) + "   Заданный массив.");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr) + " Числа меньше 6 умноженые на 2.");
    }

    //Задание №4
    public static void fillDiagonal(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, a = arr[i].length - 1; j < arr[i].length; j++, a--){
                if (i == j || i == a){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=0;
                }
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание №5
    public static void inputScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = sc.nextInt();
        System.out.println("Введите начальное значение массива:");
        int initialValue = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Задание №6
    public static void minMaxMeaning(int... arr){
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число:" + max);
    }

    // Задание №7
    // Логика решения задачи. Сложить все элементы массива, сумму поделить на 2.
    // После, к первому элементу добавлять следующий элемент и проверять
    // на равенство с результатом деления.
    // Наверное нужна проверка, на случай, если после деления получится не целое число....
    // как проверить пока не знаю... но обязательно узнаю :)

    // Создание метода для подсчёта суммы всех элементов массива
    public static int sumArray(int... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }return sum;
    }

    //Создание метода проверки на наличие места в котором сумма левой и правой части массива равны.
    public static boolean checkBalance(int ... arr){
//        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};          //2, 2, 2, 1, 2, 2,||| 10, 1
        int a = sumArray(arr);
        int result = a / 2;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
             b += arr[i];
            if(b == result){
                return true;
            }
        }return false;
    }


}
