package com.briup.dao;

/**
 * @author zqq
 * @date 2022/10/7
 */
public interface MyInterceptor {
    public void before(Object obj);
    public void after(Object obj);
    public void afterRuturning(Object obj);
    public void afterThrowing(Object obj);
}
