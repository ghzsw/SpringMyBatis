package com.test.service.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * Created by zsw on 15-4-16.
 * FavorityUserDetails
 */
public class FavorityUserDetails extends User {

    private String email;
    private String address;
    private String phone;
    private String qq;

    public FavorityUserDetails(String username, String password,
                               Collection<? extends GrantedAuthority> authorities,
                               String email, String address, String phone, String qq) {
        super(username, password, authorities);
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.qq = qq;
    }

    public FavorityUserDetails(String username, String password,
                               boolean enabled, boolean accountNonExpired,
                               boolean credentialsNonExpired, boolean accountNonLocked,
                               Collection<? extends GrantedAuthority> authorities,
                               String email, String address, String phone, String qq) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.qq = qq;
    }
}
