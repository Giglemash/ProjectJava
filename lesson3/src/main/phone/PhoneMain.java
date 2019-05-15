package main.phone;

public class PhoneMain {
    public static void main(String[] args) {
        System.out.println("Телефонная книга");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Кирилов", "+7(495)428-62-36");
        phoneBook.add("Тычкин", "+7(495)626-80-58");
        phoneBook.add("Ярочкин", "+7(495)391-26-76");
        phoneBook.add("Желдин", "7(495)207-05-67");
        phoneBook.add("Ягодинский", "7(495)967-19-30");
        phoneBook.add("Десятков", "7(495)564-61-27");
        phoneBook.add("Кирилов", "7(495)080-37-53");

        phoneBook.info();

        System.out.println("Ваш запрос: " + phoneBook.get(".........."));
    }
}
