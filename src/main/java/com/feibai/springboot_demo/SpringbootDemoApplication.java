package com.feibai.springboot_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ImportResource({"classpath:xxx.xml"})加载xml配置
@RestController
@SpringBootApplication
public class SpringbootDemoApplication {

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    public String index(){
        return "book name is:"+ bookName+"and book author is:"+ bookAuthor;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);

        //关闭banner
        //SpringApplication springApplication = new SpringApplication(SpringbootDemoApplication.class);
        //springApplication.setBannerMode(Banner.Mode.OFF);
        //springApplication.run(args);
    }

}
