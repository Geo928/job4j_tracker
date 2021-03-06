package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenNotFindBySurname() {
        var phones = new PhoneDictionary();
        var findPerson = new ArrayList<>();
        phones.add(
                new Person("Ivan", "Ivanov", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons, is(findPerson));
    }
}