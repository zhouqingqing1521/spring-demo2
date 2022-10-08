package com.briup.service.Impl;

import com.briup.bean.bean.Role;
import com.briup.bean.service.RoleService;

/**
 * @author zqq
 * @date 2022/10/7
 */
public class RoleServiceImpl implements RoleService {
    @Override
    public void printRole(Role role) {
        System.out.println(role.getUsername());
    }
}
