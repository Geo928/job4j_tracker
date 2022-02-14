package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя при успешном поиске, иначе возвращает null.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * Сначала выполняется поиск пользователя по паспорту
     * Далее получаем список счетов этого пользователя и в нем находим нужный счет
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счета пользователя
     * @return возвращает счет пользователя при успешном поиске, иначе возвращает null.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
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
        Account one = findByRequisite(srcPassport, srcRequisite);
        Account two = findByRequisite(destPassport, destRequisite);
        if (one != null && two != null && one.getBalance() >= amount) {
                one.setBalance(one.getBalance() - amount);
                two.setBalance(two.getBalance() + amount);
                return true;
            }
        return false;
    }
}
