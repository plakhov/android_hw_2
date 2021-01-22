package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {


    private static int randomNumber(int x) {
        int a = (int) (Math.random() * x);
        return a;
    }

    public static void main(String[] args) {
//        System.out.println("Задание 1");
//        task1();
//        System.out.println();
//        System.out.println();
//        System.out.println("Задание 2");
//        task2();
//        System.out.println();
//        System.out.println();
//        System.out.println("Задание 3");
//        task3();
//        System.out.println();
//        System.out.println();
//        System.out.println("Задание 4");
//        task4();
//        System.out.println();
//        System.out.println();
//        System.out.println("Задание 5");
//        task5();
//        System.out.println();
//        System.out.println();
//        System.out.println("Задание 6");
//        int[] a = {2,2,2,1,2,2,10,1};
//        System.out.println(task6(a));
//        int[] b = {1,1,1,2,1};
//        System.out.println(task6(b));
//        int[] c = {1,2,3,4,4,3,2,1};
//        System.out.println(task6(c));
//        int[] d = {1,2,3,4,6,3,2,1};
//        System.out.println(task6(d));
//        System.out.println();
//        System.out.println();
//        System.out.println("Задание 7");
//        task7(a, new Random().nextInt(a.length)-a.length/2);
//        task7(b, new Random().nextInt(b.length)-b.length/2);
//        task7(c, new Random().nextInt(c.length)-c.length/2);
//        task7(d, new Random().nextInt(d.length)-d.length/2);
    }

    private static void task7(int[] d, int nextInt) {
        System.out.println();
        if (nextInt > 0) {//двигаем вправо
            System.out.println("Двигаем вправо на "+nextInt);
            printArray(d);
            for (int i = 0; i < nextInt; i++) {
                int temp = d[d.length-1];
                System.arraycopy(d, 0, d, 1, d.length-1);
                d[0]=temp;
            }
        }
        if (nextInt < 0) {//двигаем влево
            System.out.println("Двигаем влево на "+(-nextInt));
            printArray(d);
            for (int i = 0; i < -nextInt; i++) {
                int temp = d[0];
                System.arraycopy(d, 1, d, 0, d.length-1);
                d[d.length-1]=temp;;
            }
        }
        if (nextInt == 0) {
            System.out.println("Не двигаем");
            return;
        }
        printArray(d);
        System.out.println();
    }

    private static boolean task6(int[] a) {
        int leftIndex = 0;
        int rightIndex = a.length-1;
        int leftSum = 0;
        int rightSum = 0;
        do {
            if (leftSum > rightSum) {
                rightSum+=a[rightIndex];
                rightIndex--;
            } else if (rightSum > leftSum) {
                leftSum+=a[leftIndex];
                leftIndex++;
            } else {
                leftSum+=a[leftIndex];
                rightSum+=a[rightIndex];
                leftIndex++;
                rightIndex--;
            }
        } while (leftIndex <= rightIndex);
        return rightSum == leftSum;
    }

    private static void task5() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        printArray(a);
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println();
        System.out.printf("Индекс наибольшего элемента = %d, элемент = %d", maxIndex, a[maxIndex]);
        System.out.println();
        System.out.printf("Индекс наименьшего элемента = %d, элемент = %d", minIndex, a[minIndex]);
    }

    private static void task4() {
        int[][] a = new int[4][4];
        for (int[] rows : a) {
            Arrays.fill(rows, 0);
        }
        printArray(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
                if (i+j+1==a.length) {
                    a[i][j] = 1;
                }
            }
        }
        printArray(a);
    }

    private static void task3() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(a);
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] < 6 ? a[i]*2 : a[i];
        }
        printArray(a);

    }

    private static void task2() {
        int[] a = new int[8];
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i-1]+3;
        }
        printArray(a);
    }

    private static void task1() {
        int[] a = {0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1};
        printArray(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        printArray(a);
    }

    private static void printArray(int[] a) {
        System.out.println();
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void printArray(int[][] a) {
        System.out.println();
        for (int[] rows : a) {
            System.out.println();
            for (int column : rows) {
                System.out.print(column + " ");
            }
        }

    }

}
