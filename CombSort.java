package Sorts;

import static Sorts.SortUtils.*;


/**
 *
 *
 * @author Muhammad Moiz
 *
 */
class CombSort implements SortAlgorithm {

    private int nextGap(int gap) {
        gap = ( gap * 10 ) / 13;
        return  ( gap < 1 ) ? 1 : gap;
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T arr[]) {
        int size  = arr.length;

        int gap = size;
 
        boolean swapped = true;
 
        while (gap != 1 || swapped) {
            gap = nextGap(gap);
 
            swapped = false;
            for (int i = 0; i < size - gap ; i++) {
                if (less(arr[i + gap], arr[i])) {
                    swapped = swap(arr, i, i + gap);
                }
            }
        }
        return arr;
    }
 
    public static void main(String args[]) {
        CombSort ob = new CombSort();
        Integer arr[] = {8, 4, 1, 56, 3, -44, -1 , 0 , 36, 34, 8, 12 , -66, - 78, 23, -6, 28, 0};
        ob.sort(arr);
 
        System.out.println("sorted array");
        print(arr);
    }
}
