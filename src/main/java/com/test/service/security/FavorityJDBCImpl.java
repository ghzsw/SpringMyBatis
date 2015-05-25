package com.test.service.security;

import com.test.domain.User;
import com.test.service.Iservice;
import com.test.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zsw on 15-4-16.
 * 返回该系统的user信息
 */
@Service
public class FavorityJDBCImpl implements UserDetailsService{


    @Resource
    private Iservice userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         User user = userService.queryByUser(new User(username));

        if(user==null)
            return null;

        Set<GrantedAuthority> set =  new HashSet<GrantedAuthority>();
        set.add(new SimpleGrantedAuthority("ROLE_USER"));
        return  new FavorityUserDetails(user.getName(),user.getPassword(),
                                    set,user.getEmail(),user.getAddress(),user.getPhone(),user.getQq());
    }
}
