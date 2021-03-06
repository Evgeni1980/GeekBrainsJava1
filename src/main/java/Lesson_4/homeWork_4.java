package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class homeWork_4 {
    private static Scanner scanner;
    private static Random random;
    private static char[][] map;

    private static final int SIZE = 3;

    private static final char MAP_ELEMENT_EMPTY = '_';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_O = 'O';

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();
        initMap();
        printMap();
        while (true){
            playerTurn();
            printMap();
            if(checkWin(MAP_ELEMENT_X)){
                System.out.println("Игра окончена. Победил игрок!");
                break;
            }
            if(isMapFull()){
                System.out.println("Игра закончена! Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if(checkWin(MAP_ELEMENT_O)){
                System.out.println("Игра окончена. Победил Ai!");
                break;
            }
            if(isMapFull()){
                System.out.println("Игра закончена! Ничья!");
                break;
            }
        }
    }

    public static boolean checkWin(char element){
        // Проверка столбцов и линий.
        boolean column, line, right, left;
        column = true;
        line = true;
        for (int col = 0; col < SIZE; col++) {
            for (int lin = 0; lin < SIZE; lin++) {
                column = column & (map[col][lin] == element);
                line = line & (map[lin][col] == element);
            }
            if(column || line) return true;
        }
        // Проверка диагоналей.
        right = true;
        left = true;
        for (int i = 0; i < SIZE; i++) {
            right = right & (map[i][i] == element);
            left = left & (map[SIZE - i - 1][i] == element);
        }
            if(right || left) return true;

            return false;
    }

    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == MAP_ELEMENT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn(){
        int x, y;

        do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isMoveValid(x, y));

        map[x][y] = MAP_ELEMENT_O;
        System.out.println("AI походил в клетку [ " + (x + 1) + ", " + (y + 1) + " ]");
    }

    public static void playerTurn(){

        int x, y;
        do{
            System.out.println("Введите координаты вашего хода ('X Y')");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isMoveValid(x, y));  // ! - оператор инверсии, если true то будет false
        map[x][y] = MAP_ELEMENT_X;
    }

    public static boolean isMoveValid(int x, int y){    // Проверка на допустимость хода
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE){
            return false;
        }
        if (map[x][y] != MAP_ELEMENT_EMPTY){
            return false;
        }
        return true;
    }

    public static void printMap(){
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }
        }
    }
}
