package com.feibai.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource({"classpath:xxx.xml"})加载xml配置
@SpringBootApplication
public class SpringbootDemoApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
        //关闭banner
        //SpringApplication springApplication = new SpringApplication(SpringbootDemoApplication.class);
        //springApplication.setBannerMode(Banner.Mode.OFF);
        //springApplication.run(args);
    }

}
