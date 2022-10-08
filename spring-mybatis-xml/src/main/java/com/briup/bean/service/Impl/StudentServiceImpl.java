package com.briup.bean.service.Impl;

import com.briup.bean.bean.Student;
import com.briup.bean.dao.StudentDao;
import com.briup.bean.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zqq
 * @date 2022/10/6
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student findStudentByCondition(int id) {
        Student studentByCondition = studentDao.findStudentByCondition(id);
        return studentByCondition ;
    }

}
