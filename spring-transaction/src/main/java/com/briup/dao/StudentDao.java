package com.briup.dao;

import com.briup.bean.Student;

/**
 * @author zqq
 * @date 2022/10/7
 */
public interface StudentDao {
   Student selectStudent(int id);
   void deleteById(int id);
}
