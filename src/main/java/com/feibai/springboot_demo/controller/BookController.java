package com.feibai.springboot_demo.controller;

import com.feibai.springboot_demo.entity.Author;
import com.feibai.springboot_demo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 14:54 2019/5/27
 * @Modfied by: ${user}
 * @Modfied Date by: 14:54 2019/5/27
 */
@Controller
public class BookController {

    @GetMapping("/book")
    @ResponseBody
    public String books(@ModelAttribute("b") Book book,@ModelAttribute("a")  Author author){

        return book.toString()+">>>>>"+author.toString();
    }



    @GetMapping("/hello")
    @ResponseBody
    public void  hello(Model model){
        Map<String,Object> map = model.asMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key +">>>>>>" +value);
        }
    }


}
