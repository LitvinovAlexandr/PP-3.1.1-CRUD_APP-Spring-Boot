package ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.litivinov.springcourse.PP31.CRUD_APPSpringBoot.entity.User;

import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        Query query = (Query) entityManager.createQuery("from User ", User.class);
        return query.getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        Query query = (Query) entityManager.createQuery("delete from User " +
                                                        "where id =:userId");
        query.setParameter("userId", id);
        query.executeUpdate();
    }
}
