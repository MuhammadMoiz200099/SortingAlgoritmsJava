package Sorts;

import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * @author Muhammad Moiz
 *
 */
public interface SortAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] unsorted);

    default <T extends Comparable<T>> List<T> sort(List<T> unsorted){
        return Arrays.asList(sort(unsorted.toArray((T[]) new Comparable[unsorted.size()])));
    }

}
