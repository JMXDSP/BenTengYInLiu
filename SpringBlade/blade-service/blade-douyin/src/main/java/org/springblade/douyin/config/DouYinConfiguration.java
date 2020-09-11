package org.springblade.douyin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients({"org.springblade"})
@MapperScan({"org.springblade.**.mapper.**", "com.example.**.mapper.**"})
//@EnableConfigurationProperties(TestProperties.class)
public class DouYinConfiguration {
}
