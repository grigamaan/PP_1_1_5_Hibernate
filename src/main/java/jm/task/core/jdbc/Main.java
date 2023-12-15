package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Jeffrey", "BezoN", (byte) 59);
        userService.saveUser("Hermann", "Crack", (byte) 59);
        userService.saveUser("Bill", "Wicket", (byte) 68);
        userService.saveUser("Timothy", "Wash", (byte) 63);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

        Util.closeConnection();
    }
}
