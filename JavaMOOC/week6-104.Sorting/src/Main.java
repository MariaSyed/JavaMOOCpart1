
import java.util.Arrays;

public class Main {

    public static int smallest(int[] array) {
        int i = 0;
        int smallest = array[i];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }

            i++;
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        int i = 0;
        for (int number : array) {
            if (number == smallest) {
                return i;
            } else {
                i++;
            }
        }

        return 0;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = array[index];
        int i = index;

        while (i < array.length) {
            if (array[i] < smallest) {
                smallest = array[i];
            }

            i++;
        }

        int smallestIndex = index;
        int j = index;

        while (j < array.length) {
            if (array[j] == smallest) {
                return smallestIndex;
            } else {
                smallestIndex++;
            }

            j++;
        }

        return 0;
    }

    public static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }

    public static void sort(int[] array) {
        int i = 0;

        while (i < array.length) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
            i++;
        }

    }

    public static void main(String[] args) {

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

}
