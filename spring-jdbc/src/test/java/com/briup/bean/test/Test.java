package com.briup.bean.test;
import com.briup.bean.bean.Student;
import com.briup.bean.config.SpringConfig;
import com.briup.bean.dao.StudentDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
/**
 * @author zqq
 * @date 2022/10/6
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentDao bean = ctx.getBean(StudentDao.class);
        Student student=new Student(1,"zhangsan","男");
        bean.insert(student);
    }
    @org.junit.Test
    public void test2(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentDao bean = ctx.getBean(StudentDao.class);
        Student studnet = bean.findStudnetById(2);
        System.out.println(studnet);

    }
    @org.junit.Test
    public void test3(){
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        StudentDao bean = ctx.getBean(StudentDao.class);
        List<Student> list = bean.findAllStudent();
        System.out.println(list);
    }
    @Autowired
    private StudentDao studentDao;
    @org.junit.Test
    public void test4(){
        List<Student> list = studentDao.findAllStudent();
        list.forEach(student -> System.out.println(student));
    }
}
