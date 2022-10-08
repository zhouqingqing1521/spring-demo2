package com.briup.dao;

import com.briup.bean.bean.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author zqq
 * @date 2022/10/7
 */
@Repository
public class RoleDao {
    @Autowired
    private Role role;
   public void getRole(){
       System.out.println(role);
   }

}
