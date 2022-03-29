package com.hzn.mapper;

import com.hzn.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     */
    int insertUser();

    /**
     * 修改用户
     */
    void updateUser();

    /**
     * 删除用户
     */
    void deleteUser();

    /**
     * 查询用户
     */
     User getUserById();

    /**
     * 查询所有用户
     */
    List<User> getAllUser();
}

