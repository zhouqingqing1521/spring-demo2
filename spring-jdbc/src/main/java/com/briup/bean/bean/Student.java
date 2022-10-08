package com.briup.bean.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zqq
 * @date 2022/10/6
 */
@Data
@Builder //简化set的操作，适用于多次调用set 建造者模式
@AllArgsConstructor
@NoArgsConstructor
public class Student {
  private int id;
  private String name;
  private String gender;
}
