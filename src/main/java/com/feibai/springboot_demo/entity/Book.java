package com.feibai.springboot_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 14:52 2019/5/27
 * @Modfied by: ${user}
 * @Modfied Date by: 14:52 2019/5/27
 */
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
