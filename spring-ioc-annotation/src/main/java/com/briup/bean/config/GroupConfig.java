package com.briup.bean.config;

import com.briup.bean.bean.Group;
import org.springframework.context.annotation.Bean;

/**
 * 普通类
 * @Author lining
 * @Date 2022/9/30
 */
public class GroupConfig {
    @Bean
    public Group group(){
        return new Group();
    }
}
