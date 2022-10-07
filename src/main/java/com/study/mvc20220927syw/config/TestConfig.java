package com.study.mvc20220927syw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {


    @Bean //이러면 IoC에 이 클래스가 등록됨.
    //메소드명 testSetting 으로 빈 객체가 등록됨.
    public TestSetting testSetting(){
        return new TestSetting();
    }


}
