package practice.ds.middle.second;

import java.util.Comparator;
import java.util.TreeMap;

public class PhoneBook {
    private final TreeMap<String, String> phoneBook = new TreeMap<>(Comparator.naturalOrder());

    public PhoneBook() {
    }

    /**
     * Добавление нового номера в книжку
     *
     * @param name имя
     * @param number номер
     */
    public void addPhone(String name, String number) {
        phoneBook.put(name, number);
    }

    /**
     * Получение номера по имени
     *
     * @param name имя
     * @return номер телефона по имени
     */
    public String getPhone(String name) {
        return phoneBook.get(name) == null ? "" : phoneBook.get(name);
    }

    /**
     * Удаление номера по имени
     *
     * @param name имя
     */
    public void removePhone(String name) {
        phoneBook.remove(name);
    }

    /**
     * Вывод в алфавитном порядке
     */
    public void printPhoneBook() {
        for (String key : phoneBook.keySet()) {
            System.out.println(key + ": " + phoneBook.get(key));
        }
    }


}
