package com.briup.bean.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * @author zqq
 * @date 2022/10/4
 */
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.briup.service.*.*(..))")
    private void pt(){}
    //前置通知
    @Before("pt()")
    public void beforeAdvice(){
        System.out.println("前置通知");
    }
    //后置通知
    public void afterAdvice(){
        System.out.println("后置通知");
    }
    //异常通知
    public void adviceThrow(Exception e){
        System.out.println("抛出异常后通知"+e.getMessage());
    }
    //返回后通知
    public void adviceReturn(){
        System.out.println("返回后通知");
    }
    //环绕通知
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前");
        Object[] args = point.getArgs();
        Object proceed = point.proceed(args);
        System.out.println("环绕后");
    }
}
