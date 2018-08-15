package com.zb.spring.demo.Service.security.doamin;

import java.util.Collections;

/**
 * @Author zhaobinr
 * @Date 2018/8/14 17 56
 * @Description
 */
public class MysUserService extends User {
    private User user;

    public MysUserService(User user) {
        super(user.getPassword(), user.getPassword(), Collections.EMPTY_SET, true, true, true, true);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
