package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

//    private UserDao UserDao = new UserDaoJDBCImpl();
    private UserDao UserDao = new UserDaoHibernateImpl();

    public void createUsersTable() {
        UserDao.createUsersTable();
    }

    public void dropUsersTable() {
        UserDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        UserDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        UserDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return UserDao.getAllUsers();
    }

    public void cleanUsersTable() {
        UserDao.cleanUsersTable();
    }
}
