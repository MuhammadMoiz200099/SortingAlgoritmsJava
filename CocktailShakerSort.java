package Sorts;

/**
 *
 *
 * @author Muhammad Moiz
 *
 */

class CocktailShakerSort implements SortAlgorithm {


    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {

        int length = array.length;
        int left = 0;
        int right = length - 1;
        int swappedLeft, swappedRight;
        while (left < right) {
            swappedRight = 0;
            for (int i = left; i < right; i++) {
                if (SortUtils.less(array[i + 1], array[i])) {
                    SortUtils.swap(array, i, i + 1);
                    swappedRight = i;
                }
            }
            right = swappedRight;
            swappedLeft = length - 1;
            for (int j = right; j > left; j--) {
                if (SortUtils.less(array[j], array[j - 1])) {
                    SortUtils.swap(array, j - 1, j);
                    swappedLeft = j;
                }
            }
            left = swappedLeft;
        }
        return array;

    }
    
    public static void main(String[] args) {

        Integer[] integers = { 4, 23, 6, 78, 1, 54, 231, 9, 12 };
	CocktailShakerSort shakerSort = new CocktailShakerSort();

	SortUtils.print(shakerSort.sort(integers));

        String[] strings = { "c", "a", "e", "b", "d" };
	SortUtils.print(shakerSort.sort(strings));
    }


}
