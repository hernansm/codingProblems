/**
 #118
 Given a sorted list of integers, square the elements and give the output in sorted order.

 EX: [-9, -2, 0, 2, 3] -> [81, 4, 0, 4, 9] -> [0, 4, 4, 9 ,81]

 Arrays sort performance: O(nlogn) - primitives uses quicksort
    for object types, mergesort is used, O(nlogn)

 **/
import java.util.Arrays;

public class square_sort_list {
    public static void main(String[] args) {
        System.out.println("#118: square and sort the given list");

        int[] test1 = {-9,-2,0,2,3};

        // bruteforce way. square and sort the list. takes O(nlogn)
        int[] sortedSquared = squareList(test1);
        Arrays.sort(sortedSquared);
        printArray(sortedSquared);

        // faster way.
        // there are 2 sublists in the array. possitive and negative numbers
        // positive numbers if sorted will remain sorted after squared.
        // negative numbers would be in reverse order
        // - reverse the order of the negative numbers
        // then apply merge of the sublists
        // takes O(n) time
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int[] squareList(int[] array) {
        int[] squared = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            // x ** 2 for x in array
            double value = array[i];
            squared[i] =  (int)(value * value);
        }
        return squared;
    }
}