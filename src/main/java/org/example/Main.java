package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("5.5");
        strings.add("my_string");
        removeEvenNumber(strings);
        System.out.println(strings);
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }

    static void removeEvenNumber(List<String> numbers) {
        // Удалить все четные элементы из списка
        for (int i = 0; i < numbers.size(); i++) {
            try {
                Integer num = Integer.parseInt(numbers.get(i));
                if (num % 2 == 0) {
                    numbers.remove(i);
                }
            } catch (NumberFormatException e) {
            }
        }
    }

    static void removeIntegers(List<String> strings) {
        // Удалить строки, которые являются целыми числами
        for (int i = 0; i < strings.size(); i++) {
            try {
                Integer num = Integer.parseInt(strings.get(i));
                if (num % 1 == 0) {
                    strings.remove(i);
                }
            } catch (NumberFormatException e) {
            }
        }
    }
}