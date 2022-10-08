package com.briup.bean.config;
import org.springframework.context.annotation.*;

/**
 * @author zqq
 * @date 2022/10/6
 */
@Configuration
@ComponentScan("com.briup")
@PropertySource("jdbc.properties")
@Import(JdbcConfig.class)
public class SpringConfig {
}
