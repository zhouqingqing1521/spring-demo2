package com.briup.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zqq
 * @date 2022/10/7
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Value("1")
    private Integer id;
    @Value("zhangsan")
    private String username;
    @Value("root")
    private String password;
}
