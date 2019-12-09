package com.further.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Observable;
import java.util.Properties;

/**
 * @Classname BeanFactory
 * @Description TODO
 * @Author mwj
 * @Version V1.0.0
 * @Date 2019/12/6 11:23
 */
public class BeanFactory {
    private static Properties props;
    static {
        try {
        props = new Properties();
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
         props.load(in);
        } catch (IOException e) {
            throw new ExceptionInInitializerError("初始化Properties错误");
        }

    }
    public static Object getBean(String beanName){
    Object bean = null;
    try {
        String beanpath = props.getProperty(beanName);
        bean = Class.forName(beanpath).newInstance();
    }catch (Exception e){
        e.printStackTrace();
    }

    return  bean;
    }

}
