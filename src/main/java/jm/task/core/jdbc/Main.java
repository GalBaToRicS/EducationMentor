package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
/**
 *  Создание таблицы User(ов)
 *  Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в
 *  консоль ( User с именем – name добавлен в базу данных )
 *  Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
 *  Очистка таблицы User(ов)
 *  Удаление таблицы
 */
public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        System.out.println("0");
        userService.createUsersTable();
        System.out.println("11");

        userService.saveUser("Джо", "Байден", (byte) 78);
        System.out.println("4");
        userService.saveUser("Трамп", "Дональд", (byte) 74);
        System.out.println("5");
        userService.saveUser("Барак", "Обама", (byte) 59);
        System.out.println("6");
        userService.saveUser("Джордж", "Буш", (byte) 74);
        System.out.println("7");

        userService.getAllUsers();

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}