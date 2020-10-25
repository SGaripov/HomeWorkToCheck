package lesson2;

import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {

        // Задание №1

        System.out.println("\n Задание №1\n");

        task1();

        // Задание №2

        System.out.println("\n \n Задание №2\n");

        task2();

        // Задание №3

        System.out.println("\n \n Задание №3\n");

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        task3(array);

        // Задание №4

        System.out.println("\n \n Задание №4\n");

        task4(array);

        // Задание №5

        System.out.println("\n \n Задание №5\n");

        task5();

        // Задание №6

        System.out.println("\n \n Задание №6\n");

        /*** Пытался но не смог понять как реализовать корректный выход из метода с true!!!***/

       int[] arrayTrue = {1,1,1,1,4};
       int[] arrayFalse = {2,2,1,4};

        System.out.println("\n"+task6(arrayTrue, arrayFalse));

    }

    public static void task1() {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Изначальный массив:");

        for (int i = 0; i < 10; i++) {
            System.out.print("  " + array[i]);
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("\nЗамененный массив");

        for (int i = 0; i < 10; i++) {
            System.out.print("  " + array[i]);
        }
    }

    public static void task2() {

        int[] array = new int[8];

        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0:
                    array[i] = 1;
                    break;
                case 1:
                    array[i] = 4;
                    break;
                case 2:
                    array[i] = 7;
                    break;
                case 3:
                    array[i] = 10;
                    break;
                case 4:
                    array[i] = 13;
                    break;
                case 5:
                    array[i] = 16;
                    break;
                case 6:
                    array[i] = 19;
                    break;
                case 7:
                    array[i] = 22;
                    break;
            }

        }
        System.out.println("Заполненный массив: ");
        for (int i = 0; i < 8; i++) {
            System.out.print("  " + array[i]);
        }
    }

    public static void task3(int array[]) {

        System.out.println("Получен массив на входе:");

        for (int i = 0; i < 12; i++) {
            System.out.print("  " + array[i]);
        }
        for (int i = 0; i < 12; i++) {

            if (array[i] < 6) {
                array[i] *= 2;
            }

        }
        System.out.println("\nЧисла менее 6, умножены на 2:");
        for (int i = 0; i < 12; i++) {
            System.out.print("  " + array[i]);
        }
    }

    public static void task4(int array[]) {

        System.out.println("Массив:\n");

        for (int i = 0; i < array.length; i++) {
            System.out.print("  " + array[i]);
        }
        Arrays.sort(array);
        System.out.println("\n\n В массиве максимальное значение:"+array[array.length-1]+"\n А минимальное значение: " + (array[0]));
    }

    public static void task5() {

        int [][] array2 = new int [7][7];

        for (int i = 0; i < array2.length; i++) {
            for (int j=0; j< array2[i].length; j++) {
                array2[i][(array2.length-1)-i]=1;
                array2[i][array2.length-(array2.length-i)]=1;

                System.out.print(array2[i][j]+"  ");
            }
            System.out.println();

        }

    }

    public static boolean task6(int arrayTrue[], int arrayFalse[]) {

/*** Пытался но не смог понять как реализовать корректный выход из метода с true!!!***/

        int sumLR = 0;
        int sumRL = 0;


        for (int i = arrayTrue.length-1; i >= 0; i--){

            System.out.print("  " + arrayTrue[i]);

            sumRL=sumRL+arrayTrue[i];

            if (sumLR==sumRL)
                return true;

            for (int j = 0; j < arrayTrue.length; j++) {

                sumLR = sumLR + arrayTrue[j];

                if (sumLR==sumRL) {
                    break;}
            }

        }
            return true;

    }
}