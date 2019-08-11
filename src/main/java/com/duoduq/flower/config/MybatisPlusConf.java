package com.duoduq.flower.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @Auther: Jack
 * @Date: 2019-07-30 14:28
 * @Description:
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.duoduq.flower.dao")
public class MybatisPlusConf {

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //最大单页限制数量，默认500条，小于0如-1不受限制
        //paginationInterceptor.setLimit(500);
        return paginationInterceptor;
    }
}
