package com.briup.bean.service.Impl;

/**
 * @author zqq
 * @date 2022/10/4
 */
public class TeacherService implements com.briup.bean.service.TeacherService {
    @Override
    public void saveOrUpdate() {
        System.out.println("saveOrUpdate:保存成功...");
    }

    @Override
    public void delete() {
        System.out.println("delete：删除成功...");
    }

    @Override
    public void deleteBatch() {
        System.out.println("deleteBatch：批量删除成功...");
    }
}
