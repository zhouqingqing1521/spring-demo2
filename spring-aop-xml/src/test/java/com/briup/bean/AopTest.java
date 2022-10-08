package com.briup.bean;
import com.briup.bean.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/** 
 * @author zqq
 * @date 2022/10/4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AopTest {
    @Autowired
    private TeacherService teacherService;
    @Test
    public void test() {
        teacherService.saveOrUpdate();
    }
    @Test
    public void test2() {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        TeacherService bean = ctx.getBean(TeacherService.class);
        bean.delete();
    }
    @Test
    public void test3() {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("application.xml");
        TeacherService bean = ctx.getBean(TeacherService.class);
        bean.delete();
    }
}
