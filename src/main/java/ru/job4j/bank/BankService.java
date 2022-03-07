package ru.job4j.bank;

import java.util.*;
import java.util.stream.Stream;

/**
 * Класс описывает главный сервис
 * Данный сервис содержит поле, которое включает в себя всех
 * пользователей системы с привязанными к ним счетами.
 * Также данный класс содержит методы для: добавления пользователя в систему,
 * добавления нового счета к пользователю, поиска пользователя по номеру паспорта,
 * поиска счета пользователя по реквизитам, перечисления денег с одного счёта на другой счёт.
 * @author GEORGY KARKAZIDI
 * @version 1.0
 */

public class BankService {
    /**
     * Хранение пользователей осуществляется в виде пар ключ/значение
     * в структуре данных типа HashMap.
     * Ключ - пользователь, значение - список его счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * В методе есть проверка, что такого пользователя еще нет в системе.
     * @param user объект класса User
     */
    public void addUser(User user) {
      users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет к пользователю
     * Первоначально метод находит пользователя по паспорту
     * Далее мы получим список всех счетов пользователя и добавим новый счет к ним.
     * Также в методе присутствует проверка, что такого счета у пользователя еще нет.
     * @param passport номер паспорта пользователя
     * @param account новый счет пользователя
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя при успешном поиске, иначе возвращает null.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * Сначала выполняется поиск пользователя по паспорту
     * Далее получаем список счетов этого пользователя и в нем находим нужный счет
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счета пользователя
     * @return возвращает счет пользователя при успешном поиске, иначе возвращает null.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> rsl = Optional.empty();
        if (user.isPresent()) {
             rsl = users.get(user.get())
                     .stream()
                     .filter(s -> s.getRequisite().equals(requisite))
                     .findFirst();
            }
        return rsl;
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     * @param srcPassport номер паспорта пользователя который переводит деньги
     * @param srcRequisite реквизиты счета пользователя который переводит деньги
     * @param destPassport номер паспорта пользователя которому переводят деньги
     * @param destRequisite реквизиты счета пользователя которому переводят деньги
     * @param amount сумма перевода
     * @return возвращает true если операция прошла успешно или false
     * если счёт не найден или не хватает денег на счёте с которого переводят
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> one = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> two = findByRequisite(destPassport, destRequisite);
        if (one.isPresent() && two.isPresent() && one.get().getBalance() >= amount) {
                one.get().setBalance(one.get().getBalance() - amount);
                two.get().setBalance(two.get().getBalance() + amount);
                return true;
            }
        return false;
    }
}
