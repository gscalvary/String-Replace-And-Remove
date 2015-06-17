package com.oliver;

public class Main {

    public static void main(String[] args) {

        char[] array = new char[]{'a', 'c', 'a', 'a', Character.MIN_VALUE, Character.MIN_VALUE, Character.MIN_VALUE};
        CharArrayModifier.modify(array);
        for(char c : array) {
            System.out.print(c + " ");
        }
    }
}
