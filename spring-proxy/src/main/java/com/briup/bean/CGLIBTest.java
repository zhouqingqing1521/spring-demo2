package com.briup.bean;

import com.briup.bean.service.StudentService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zqq
 * @date 2022/10/4
 */
public class CGLIBTest {
    public static void main(String[] args) {
        //CGLIB中产生代理对象的核心类型
        Enhancer enhancer = new Enhancer();
        // 设置代理类的父类对象
       enhancer.setSuperclass(StudentService.class);
       enhancer.setCallback(new MethodInterceptor() {
           @Override
           public Object intercept(Object propxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
               System.out.println("开启事务");
               Object result = methodProxy.invokeSuper(propxy, args);
               System.out.println("提交事务");
               return result;
           }
       });
        StudentService service = (StudentService)enhancer.create();
        service.saveOrUpdate();

    }
}
