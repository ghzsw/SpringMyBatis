package com.test.dao;

import com.test.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zsw on 15-3-14.
 */
public interface UserMapper {


    int deleteByPrimaryKey(String id);

    int insert(User user);

    int updateUser(User user);

    User queryByUser(User user);

    List<User> getAll();
}
