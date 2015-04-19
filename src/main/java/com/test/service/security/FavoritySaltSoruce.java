package com.test.service.security;

import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by zsw on 15-4-19.
 * 该系统的盐值
 */
public class FavoritySaltSoruce implements SaltSource {
    @Override
    public Object getSalt(UserDetails user) {

        if (UserDetails.class.isAssignableFrom(user.getClass())) {
            return ((FavorityUserDetails) user).getUsername();
        } else
            return null;
    }
}
