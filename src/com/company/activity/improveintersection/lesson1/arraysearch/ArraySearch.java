package com.company.activity.improveintersection.lesson1.arraysearch;

public class ArraySearch {
    // Поиск слова из массива
    public int search(String strToMatch, String[] strArray) {
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(strToMatch)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArraySearch arraySearch = new ArraySearch();
        int index = arraySearch.search("Alien",
                new String[]{"Interstellar", "District 9", "Blade Runner", "Alien", "Minority Report", "Primer"});
        System.out.printf("index: %d",index);

    }
}
