package HW;

import java.util.*;

public class PhoneBook {

    public static void main(String[] args) {

        // HashMap для хранения имени и списка телефонов

        Map<String, List<String>> phoneBook = new HashMap<>();

        // телефонная книга

        addContact(phoneBook, "Ваня", "8-957-367-01-02");

        addContact(phoneBook, "Маша", "8-962-987-89-78");

        addContact(phoneBook, "Ваня", "8-971-754-65-56");

        addContact(phoneBook, "Галя", "8-939-899-72-94");

        addContact(phoneBook, "Галя", "8-939-899-72-94");

        addContact(phoneBook, "Артем", "8-939-899-72-94");

        addContact(phoneBook, "Николай", "8-939-899-72-94");

        addContact(phoneBook, "Ваня", "8-939-899-72-94");

        // Сортировка записи по убыванию числа телефонов

        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());

        sortedEntries.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        // Вывод отсортированных записей

        for (Map.Entry<String, List<String>> entry : sortedEntries) {

            String name = entry.getKey();

            List<String> phones = entry.getValue();

            System.out.println(name + ": " + phones.size() + " телефон(а/ов) - " + phones);

        }

    }

    // Метод для добавления контакта в телефонную книгу

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phone) {

        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);

    }

}