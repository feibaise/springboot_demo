package com.feibai.springboot_demo.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.lang.reflect.Modifier;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 15:35 2019/5/27
 * @Modfied by: ${user}
 * @Modfied Date by: 15:35 2019/5/27
 */
@Configuration
public class GsonConfig {


    @Bean
    GsonHttpMessageConverter gsonHttpMessageConverter(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        GsonBuilder builder = new GsonBuilder();
        builder.setDateFormat("yyyy-MM-dd");
        builder.excludeFieldsWithModifiers(Modifier.PROTECTED);
        Gson gson = builder.create();
        converter.setGson(gson);
        return converter;
    }
}
