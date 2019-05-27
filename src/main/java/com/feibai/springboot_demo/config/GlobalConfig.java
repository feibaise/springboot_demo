package com.feibai.springboot_demo.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 *@Author: wushi
 *@description: 全局配置数据
 *@Date: Created in 15:57 2019/5/27
 *@Modify by: wushi
 *@ModifyDate by: 15:57 2019/5/27
 *
 */
@ControllerAdvice
public class GlobalConfig {


    @InitBinder("b")
    public  void  init (WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }


    @InitBinder("a")
    public  void  init2 (WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }


}
