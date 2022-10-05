package com.darmawan.budi.exercise.servlet.listener.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@Slf4j
@WebListener
public class InitConnectionDb implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("webapp started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("webapp destroyed");
    }
}
