package com.zb.spring.demo.Service.security.impl;

import com.zb.spring.demo.Service.security.IUserService;
import com.zb.spring.demo.Service.security.doamin.User;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author zhaobinr
 * @Date 2018/8/14 17 30
 * @Description
 */
@Primary
@Service
public class UserServiceImpl implements IUserService {
    private final static List<User> users = new ArrayList();

    static {
        users.add(new User("admin", "123456"));
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> optionalUser = users.stream()
                .filter(aa -> aa.getUsername().equals(s))
                .findFirst();
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        }
        return null;
    }
}
