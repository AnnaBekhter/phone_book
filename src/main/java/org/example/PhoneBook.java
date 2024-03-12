package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private static HashMap<String, HashSet<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.get(name) == null) {
            phoneBook.put(name, new HashSet<>(phoneNum));
        }
        phoneBook.get(name).add(phoneNum);
    }

    public Set<Integer> find(String name) {
        if (phoneBook.get(name) == null) {
            return new HashSet<>();
        }
        return phoneBook.get(name);
    }

    public static HashMap<String, HashSet<Integer>> getPhoneBook() {
        return phoneBook.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
