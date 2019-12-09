package org.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 20;
        int lowestNumber = 0;
        int highestNumber = 20;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);


        Pattern1();
        Pattern2();
        Pattern3();
    }


    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];


        //fill in with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber)));
        return number;
    }

    public static void Pattern1() {
        for (int i = 0; i < 6; i++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void Pattern2() {
        for (int e = 1; e < 6; e++) {
            for (int row = 1; row < 6; row++) {
                System.out.print(e);
            }
            System.out.println();
        }

    }

    public static void Pattern3() {
        for (int e = 1; e < 7; e++) {
            for (int row = 1; row < 7; row++) {
                System.out.print(row);
            }
            System.out.println();

        }

    }

    public st

}



