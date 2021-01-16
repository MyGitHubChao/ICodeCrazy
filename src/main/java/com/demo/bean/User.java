package com.demo.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@ToString
@Component
public class User {

    @Getter
    @Setter
    private String age;

    @Setter
    @Getter
    private String id;

    @Setter
    @Getter
    private String name;

    @PostConstruct
    public void init(){
        System.out.println(this);

    }


}

