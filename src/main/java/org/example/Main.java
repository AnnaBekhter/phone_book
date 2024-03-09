package org.example;

public class Main {
    public static void main(String[] args) {
        String name1 = "Ivanov";
        String name2 = "Petrov";
        String name3 = "Sidorov";
        String name4 = "Sokolov";
        String name5 = "Semenov";
        int phone1 = 123456;
        int phone2 = 654321;
        int phone3 = 754321;
        int phone4 = 354321;
        int phone5 = 854321;
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);

        myPhoneBook.add(name2, phone2);

        myPhoneBook.add(name3, phone3);
        myPhoneBook.add(name3, phone4);
        myPhoneBook.add(name3, phone5);

        myPhoneBook.add(name4, phone5);
        myPhoneBook.add(name4, phone1);
        myPhoneBook.add(name4, phone1);
        myPhoneBook.add(name4, phone3);
        myPhoneBook.add(name4, phone4);

        myPhoneBook.add(name5, phone4);
        myPhoneBook.add(name5, phone4);

        System.out.println(PhoneBook.getPhoneBook());
    }
}