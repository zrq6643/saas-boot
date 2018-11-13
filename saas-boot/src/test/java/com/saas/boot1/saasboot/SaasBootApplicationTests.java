package com.saas.boot1.saasboot;

import com.saas.boot1.saasboot.bean.BlogProperties;
import com.saas.boot1.saasboot.bean.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j//注入日志对象
public class SaasBootApplicationTests {

    @Autowired
    private BlogProperties blogProperties;
    @Autowired
    private Student ailiStudent;


    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "程序猿DD");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
        System.out.println(blogProperties.getDesc());
        System.out.println(blogProperties.getValue());
        System.out.println(ailiStudent);
        log.debug("***");
    }
}
