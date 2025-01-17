package ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.service;



import ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
