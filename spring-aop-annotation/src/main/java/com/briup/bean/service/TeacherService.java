package com.briup.bean.service;

import org.springframework.stereotype.Service;

/**
 * @author zqq
 * @date 2022/10/4
 */
public interface TeacherService {
    void saveOrUpdate();
    void delete();
    void deleteBatch();
}
