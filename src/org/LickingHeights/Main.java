package org.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 20;
        int lowestNumber = 0;
        int highestNumber = 20;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);
    }


    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill in with random values
        for (int h = 0; h < size; h++) {
            array[h] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int h = 0; h < array.length; h++) {
            System.out.println(array[h]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber)));
        return number;
    }

    public static void Pattern1() {

        for (int columns = 0; columns < 6; columns++) {
            System.out.println("*");
        }
        System.out.println();
    }
}

    public static void Pattern2() {
        for (int e = 1; e < 6; rows++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }

    public static void Pattern3() {
        for (int e = 1; e < 7; e++) {
            for (int row = 1; row < 7; row++) {
                System.out.print(row);
            }
        }
    }
    