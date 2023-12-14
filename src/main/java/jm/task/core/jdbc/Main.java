package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Jeffrey", "BezoN", (byte) 59);
        userDao.saveUser("Hermann", "Crack", (byte) 59);
        userDao.saveUser("Bill", "Wicket", (byte) 68);
        userDao.saveUser("Timothy", "Wash", (byte) 63);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
