package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> name = p -> p.getName().contains(key);
        Predicate<Person> surName = p -> p.getSurname().contains(key);
        Predicate<Person> phone = p -> p.getPhone().contains(key);
        Predicate<Person> address = p -> p.getAddress().contains(key);
        Predicate<Person> combine = name.or(surName).or(phone).or(address);
        ArrayList<Person> result = new ArrayList<>();
        for (var rsl : persons) {
            if (combine.test(rsl)) {
                result.add(rsl);
            }
        }
        return result;
    }
}
