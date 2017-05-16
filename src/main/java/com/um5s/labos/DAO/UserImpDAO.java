package com.um5s.labos.DAO;

import com.um5s.labos.DAO.entity.User;
import com.um5s.labos.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by zGuindouOS on 16/05/2017.
 */
public class UserImpDAO implements IUserDAO{

    Session session = HibernateUtil.openSession();

    public void add(User user) {
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    public User edite(User user) {
        session.beginTransaction();
        User u = (User) session.merge(user);
        session.getTransaction().commit();
        return u;
    }

    public void delete(Long id) {
        session.beginTransaction();
        User u = findById(id);
        session.delete(u);
        session.getTransaction().commit();
    }

    public List<User> findAll() {
        return session.createQuery("select o from User o").list();
    }

    public User findById(Long id) {
        return (User) session.get(User.class, id);
    }
}
