package com.um5s.labos.DAO;

import com.um5s.labos.DAO.entity.User;

import java.util.List;

/**
 * Created by zGuindouOS on 16/05/2017.
 */
public interface IUserDAO {

    public void add(User user);
    public User edite(User user);
    public void delete(Long id);
    public List<User> findAll();
    public User findById(Long id);

}
