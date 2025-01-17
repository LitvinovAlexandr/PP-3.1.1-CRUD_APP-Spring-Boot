package ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.dao.UserDAO;
import ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.entity.User;

import java.util.List;

@Service
public class UserServiceEmpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
