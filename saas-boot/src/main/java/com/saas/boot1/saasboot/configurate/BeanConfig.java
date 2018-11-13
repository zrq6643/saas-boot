package com.saas.boot1.saasboot.configurate;

import com.saas.boot1.saasboot.bean.Student;
import com.saas.boot1.saasboot.filter.MyFilter1;
import com.saas.boot1.saasboot.filter.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Student ailiStudent(){
        return  new Student();
    }

    @Bean
/*
    FilterRegistrationBean是springboot提供的，此类提供setOrder方法，
    可以为filter设置排序值，让spring在注册web filter之前排序后再依次注册。
    注册多个时，就注册多个FilterRegistrationBean即可
*/
    public FilterRegistrationBean filterRegistrationBean1() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，
        // 这样不可自动注入过滤器使用的其他bean类。
        //当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
        registration.setFilter(customFilter1());
        //过滤器名称
        registration.setName("customFilter1");
        //拦截路径
        registration.addUrlPatterns("/*");
        //设置顺序
        registration.setOrder(10);
        return registration;
    }

    @Bean
    public MyFilter1 customFilter1() {
        return new MyFilter1();
    }

    public FilterRegistrationBean filterRegistrationBean2() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，
        // 这样不可自动注入过滤器使用的其他bean类。
        //当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
        registration.setFilter(customFilter2());
        //过滤器名称
        registration.setName("customFilter2");
        //拦截路径
        registration.addUrlPatterns("/*");
        //设置顺序
        registration.setOrder(5);
        return registration;
    }

    @Bean
    public MyFilter2 customFilter2() {
        return new MyFilter2();
    }

}
