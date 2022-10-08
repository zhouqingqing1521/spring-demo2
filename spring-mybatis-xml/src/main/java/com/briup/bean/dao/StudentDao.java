package com.briup.bean.dao;

import com.briup.bean.bean.Student;

/**
 * @author zqq
 * @date 2022/10/6
 */
public interface StudentDao {
    Student findStudentByCondition(int id);
}
