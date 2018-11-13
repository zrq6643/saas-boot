package com.saas.boot1.saasboot.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Student {

    @Value("${com.didispace.blog.name}")
    private String name;
}
