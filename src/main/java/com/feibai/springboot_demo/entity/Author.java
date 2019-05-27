package com.feibai.springboot_demo.entity;

import lombok.*;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 16:10 2019/5/27
 * @Modfied by: ${user}
 * @Modfied Date by: 16:10 2019/5/27
 */
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Getter
    @Setter
    private String name;
    @Setter
    @Getter
    private int age;


    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
