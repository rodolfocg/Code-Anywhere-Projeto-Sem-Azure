package com.avanade.dio.jwt.service;

import com.avanade.dio.jwt.data.UserData;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails LoadUserByName(String userName) throws UsernameNotFoundException{

        UserData user = findUser(userName);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
            return new User(user.getUserName(), user.getPassword(), Collections.emptyList());
    }
}
