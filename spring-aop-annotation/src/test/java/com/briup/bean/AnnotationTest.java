package com.briup.bean;

import com.briup.bean.config.SpringAopConfig;
import com.briup.bean.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zqq
 * @date 2022/10/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringAopConfig.class)
public class AnnotationTest {
    @Autowired
    private TeacherService teacherService;
    @Test
    public void test(){
       teacherService.saveOrUpdate();
    }
}
