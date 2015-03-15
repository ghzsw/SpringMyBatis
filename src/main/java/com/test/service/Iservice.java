package com.test.service;

import com.test.domain.User;

import java.util.List;

/**
 * Created by zsw on 15-3-14.
 */
public interface Iservice {


    int insert(User user);

    List<User> getAll();

    User queryByUser(User user);

    int upateByUser(User user);

    int deleteByUser(User user);

}
