package com.briup.bean;

import com.briup.bean.bean.Student;
import com.briup.bean.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author zqq
 * @date 2022/10/6
 */
public class MybatisXmlTest {
    @Test
    public void test(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("mybatis-spring.xml");
        //2.获取映射器对象
        String[] names = ctx.getBeanDefinitionNames();
        System.out.println(Arrays.toString(names));
        StudentService bean = ctx.getBean(StudentService.class);
        Student student = bean.findStudentByCondition(1);
        System.out.println(student);
    }
}
