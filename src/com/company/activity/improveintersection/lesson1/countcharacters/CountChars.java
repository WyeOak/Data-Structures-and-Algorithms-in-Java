package com.company.activity.improveintersection.lesson1.countcharacters;

public class CountChars {
    //поиск количества символа в строке
    public int countChars(char c, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) count++;
        }
        return count;
    }

    public static void main(String args[]) {
        CountChars countChars = new CountChars();
        System.out.println(countChars.countChars('a', "Sally sells sea shells on the seashore"));
    }
}