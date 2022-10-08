package com.briup.bean.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zqq
 * @date 2022/10/5
 */
@Configuration
@ComponentScan("com.briup")
@EnableAspectJAutoProxy
public class SpringAopConfig {
}
