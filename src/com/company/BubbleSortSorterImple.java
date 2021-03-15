package com.company;

import java.util.Comparator;

public class BubbleSortSorterImple <T> implements Sorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        boolean sorted = false;
        T temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (c.compare(arr[i],arr[i+1]) > 0) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
