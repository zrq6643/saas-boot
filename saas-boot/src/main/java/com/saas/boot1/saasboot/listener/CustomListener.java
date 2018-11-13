package com.saas.boot1.saasboot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
/*
Listeeshi是servlet规范中定义的一种特殊类。用于监听servletContext、HttpSession和servletRequest
等域对象的创建和销毁事件。监听域对象的属性发生修改的事件。用于在事件发生前、发生后做一些必要的处理。
一般是获取在线人数等业务需求。
和创建过滤器一样，在启动类中加入@ServletComponentScan进行自动注册即可。
*/
@WebListener
@Slf4j
public class CustomListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("监听器：销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("监听器：初始化");
    }
}
