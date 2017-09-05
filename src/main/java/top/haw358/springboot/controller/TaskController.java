package top.haw358.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.haw358.springboot.config.bean.ConfigBean;
import top.haw358.springboot.db.DBConnector;
import top.haw358.springboot.config.bean.ConfigRandomBean;

/**
 * Created by haw on 17-8-28.
 */
@RestController
@RequestMapping("/task")
@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class, ConfigRandomBean.class})
public class TaskController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DBConnector dbConnector;

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private ConfigRandomBean configRandomBean;

    @RequestMapping
    public String helloTask(){
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        return "a hello task !! myage is " + dbConnector.configure();
    }

    @RequestMapping("/hope")
    public String hope(){
        return configBean.getName()+","+configBean.getWant();
    }

    @RequestMapping("/random")
    public String random(){
        return configRandomBean.getSecret() + "<br/>" + configRandomBean.getUuid()+"<br/>"+
                configRandomBean.getBignumber()+"<br/>"+configRandomBean.getNumber()+"<br/>"+
                configRandomBean.getRange()+"<br/>"+configRandomBean.getTen()+"<br/>";
    }
}
