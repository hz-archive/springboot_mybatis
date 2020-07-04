package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement //开启声明式事务
//@ComponentScan("com.atguigu") //不推荐使用。框架默认扫描main程序所在的包以及子包。
@MapperScan("com.atguigu.dao") //生成dao的代理对象,将dao代理对象交给Spring IOC容器进行管理。或者直接在dao层加@Mapper
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
