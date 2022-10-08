package com.briup.bean.service;

import com.briup.bean.dao.UserDao;
import lombok.Data;

/**
 * @Author lining
 * @Date 2022/9/29
 */
@Data
public class UserServiceImpl implements IUserService {
    private UserDao dao;
}
