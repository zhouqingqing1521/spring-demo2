package com.briup.service;

import com.briup.bean.Student;

/**
 * @author zqq
 * @date 2022/10/7
 */
public interface StudentService {
    Student selectStudent(int id);
    void deleteById(int id);
}
