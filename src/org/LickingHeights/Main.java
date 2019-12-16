package org.LickingHeights;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 20;
        int lowestNumber = 0;
        int highestNumber = 20;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);




//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();


//        System.out.print("The sum of the array is " + sum(array));
//        System.out.print("The minimum of the array is " + minimum(array));
//        printArray(array);
//        System.out.print("The maximum of the array is " + maximum(array));


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

    public static int sum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }


        return sum;

    }

    public static int minimum(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum= array[i];
            }
        }
        return minimum;
    }

    public static int maximum(int[] array) {
        int maximum = array[0];
        for(int i = 1; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum= array[i];
            }
        }

        return maximum;
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
        for (int e = 1; e < 7; e++) {

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

    public static void Pattern4() {
        for (int rows = 1; rows < 7; rows++) {

            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void Pattern5() {
        for (int rows = 1; rows <= 6; rows++) {

            for (int columns = 1; columns <=rows; columns++) {
                System.out.print(rows);
            }
            System.out.println();
        }
    }



    }







