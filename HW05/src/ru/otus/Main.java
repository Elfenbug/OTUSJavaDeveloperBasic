package ru.otus;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {-9, 77, 1070, 0, -67, 2, 0};
        boolean isNeedIterable = true;
        while (isNeedIterable) {
            isNeedIterable = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isNeedIterable = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
