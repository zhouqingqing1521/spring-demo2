package com.briup.bean.web;

import com.briup.bean.service.IUserService;
import lombok.Data;

/**
 * @Author lining
 * @Date 2022/9/29
 */
@Data
public class UserWeb {
    //表示web层依赖service层
    private IUserService service;
}
