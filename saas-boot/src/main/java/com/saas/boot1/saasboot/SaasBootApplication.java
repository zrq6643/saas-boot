package com.saas.boot1.saasboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
/*@SpringBootApplication
前几章，在系统启动类里面，都加入了此启动注解，此注解是个组合注解，包括了@SpringBootConfiguration、@EnableAutoConfiguration和@ComponentScan注解。
@SpringBootConfiguration 继承至@Configuration，此标注当前类是配置类，并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入
到srping容器中，并且实例名就是方法名。
@EnableAutoConfiguration 主要是通过此注解，能所有符合自动配置条件的bean的定义加载到spring容器中，
比如根据spring-boot-starter-web ，来判断你的项目是否需要添加了webmvc和tomcat，就会自动的帮你配置
web项目中所需要的默认配置。具体的使用，会在后期自定义实现一个自动启动类时，会讲解到它的一些机制。
但比如需要排除一些无需自动配置的类时，可利用exclude进行排除。
@ComponentScan 这个熟悉spring的开发者也应该熟悉，会扫描当前包及其子包下*/

@ServletComponentScan//开启过滤器
public class SaasBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SaasBootApplication.class, args);
    }
}
