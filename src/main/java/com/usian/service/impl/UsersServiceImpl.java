package com.usian.service.impl;

import com.usian.mapper.UsersMapper;
import com.usian.pojo.Users;
import com.usian.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public List<Users> findAll() {
       return usersMapper.selectAll();
    }
}
