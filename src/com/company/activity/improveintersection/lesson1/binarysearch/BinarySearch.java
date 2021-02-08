package com.company.activity.improveintersection.lesson1.binarysearch;

public class BinarySearch {
    //Двоичный или логарифмический поиск часто используется из-за быстрого времени поиска.
    public boolean binarySearch(int elementToSearch, int[] sortedNumbers) {
        int lastIndex = sortedNumbers.length - 1;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            int middle = (lastIndex - firstIndex) / 2 + firstIndex;
            // если средний элемент - целевой элемент, вернёт true
            if (sortedNumbers[middle] == elementToSearch){
                return true;
            }
            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (sortedNumbers[middle] > elementToSearch){
                lastIndex = middle - 1;
            }
            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (sortedNumbers[middle] < elementToSearch) {
                firstIndex = middle + 1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(binarySearch.binarySearch(0, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}