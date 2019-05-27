import java.util.Arrays;

import java.util.Random;


public class Problem {

    public static void main(String[] args) {

        Problem problem = new Problem();

        int[] tab = problem.generateArray();

        int[] uniqueElements = problem.getUniqueElements(tab);

        System.out.println("Unique: "  + Arrays.toString(uniqueElements));

        System.out.println(Arrays.toString(problem.generateArray()));

    }



    private int[] generateArray() {

        int[] array = new int[100];

        Random rand = new Random();

        for (int i=0;i<array.length;i++) {

            array[i] = rand.nextInt(1000);

        }

        return array;

    }



    private int[] getUniqueElements(int[] array) {

        int[] unique = new int[100];

        int emptyIndex = 0;

        for (int i = 0; i < 100; i++) {

            if(checkIfContains(array[i], array, i)) {

                unique[emptyIndex] = array[i];
                emptyIndex++;

            }

        }

        return unique;

    }



    private boolean checkIfContains(int number, int[] array, int index) {

        boolean contains = true;

        int i = index+1;

        while(contains && i < array.length) {

            if(array[i] == number) {

                contains = false;

            }
            i++;
        }

        return contains;

    }

}