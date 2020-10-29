package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static final char Human_char = 'X';
    public static final char PC_char = '0';
    public static final char Empty_char = '_';

    public static final Scanner Scan = new Scanner(System.in);
    public static final Random Rand = new Random();

    public static int sizeX;
    public static int sizeY;
    public static char[][] field;

    public static void makeMap() {
        sizeX = 5;
        sizeY = 5;
        field = new char[sizeY][sizeX];

        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                field[y][x] = Empty_char;
            }
        }

    }
    public static void printMap() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
    }
    public static void peopleTurn() {

        int x;
        int y;

        do {
            System.out.println("Введите координаты через пробел: ");
            x = Scan.nextInt()-1;
            y = Scan.nextInt()-1;
        }
        while (!validCell(y,x)||!emptyCell(y,x));

        field[y][x] = Human_char;
    }

    public static boolean validCell( int y, int x) {
        return x >=0 && x< sizeX && y >= 0 && y < sizeY;
    }

    public static boolean emptyCell (int y, int x) {
        return field[y][x]==Empty_char;
    }
    public static void pcTurn() {
        int x;
        int y;
        do {
            x = Rand.nextInt(sizeX);
            y = Rand.nextInt(sizeY);
        } while (!emptyCell(y, x));
        field[y][x] = PC_char;
    }
    public static boolean conditionWin(char W) {

// Выигрыш реализован для серии 4, на поле 5х5

// Строки и столбцы
        for (int y = 0; y < sizeY; y++) {

            if ((field[y][0]==W && field[y][1]==W && field[y][2] == W && field[y][3] == W) || // столбцы верхняя часть
                    (field[y][1]==W && field[y][2]==W && field[y][3] == W && field[y][4] == W) || // столбцы нижняя часть
                    (field[0][y]==W && field [1][y]==W && field[2][y]==W && field[3][y]==W) || // строки левая часть
                    (field[1][y] == W && field[2][y] == W && field[3][y] == W && field[4][y] == W)) // строки правая часть
                return true;

// Диагонали :( Согласен, код не оптимальный, но работает. Не хватило времени на решение через цикл.
        }

        if      ((field[1][1] == W && field[2][2] == W && field[3][3] == W && field[4][4] == W)|| // диагональ 1
                (field[4][1] == W && field[3][2] == W && field[2][3] == W && field[1][4] == W) ||// диагональ 2
                (field[0][0] == W && field[1][1] == W && field[2][2] == W && field[3][3] == W) ||// диагональ 3
                (field[3][0] == W && field[2][1] == W && field[1][2] == W && field[0][3] == W) ||// диагональ 4
                (field[1][0] == W && field[2][1] == W && field[3][2] == W && field[4][3] == W) ||// диагональ 5
                (field[0][1] == W && field[1][2] == W && field[2][3] == W && field[3][4] == W) ||// диагональ 6
                (field[0][4] == W && field[1][3] == W && field[2][2] == W && field[3][1] == W) ||// диагональ 7
                (field[4][0] == W && field[3][1] == W && field[2][2] == W && field[1][3] == W))  // диагональ 8
        {
            return true;
        }
         return false;
    }

    public static boolean FullMap() {
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                if(field[y][x] == Empty_char) return false;
            }
        }
        return true;
    }

        public static void main (String[]args) {
            makeMap();
            printMap();
            while (true) {
                peopleTurn();
                printMap();
                if (conditionWin(Human_char)) {
                    System.out.println("Человек выиграл!!!");
                    break; // точка выхода из бесконечного цикла
                }
                if (FullMap()) {
                    System.out.println("Ничья");
                    break; // точка выхода из бесконечного цикла
                }
                System.out.println();
                pcTurn();
                printMap();
                if (conditionWin(PC_char)) {
                    System.out.println("Компьютер выиграл!");
                    break; // точка выхода из бесконечного цикла
                }
                if (FullMap()) {
                    System.out.println("Ничья");
                    break; // точка выхода из бесконечного цикла
                }
                System.out.println();
            }
        }

}