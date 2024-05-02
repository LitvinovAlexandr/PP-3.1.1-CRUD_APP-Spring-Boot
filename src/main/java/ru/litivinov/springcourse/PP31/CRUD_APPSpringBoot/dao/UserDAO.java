package ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.dao;

import ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
