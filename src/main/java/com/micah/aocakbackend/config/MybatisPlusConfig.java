package com.micah.aocakbackend.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MybatisPlusConf
 * @Description 简介
 * @Author Micah
 * @Date 2023/4/27 0:44
 * @Version 1.0
 **/
@Configuration
public class MybatisPlusConfig {


    /**
     * 开启分页插件
     * @return 分页插件
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        //定义拦截
        MybatisPlusInterceptor myInterceptor = new MybatisPlusInterceptor();
        myInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return myInterceptor;
    }
}
