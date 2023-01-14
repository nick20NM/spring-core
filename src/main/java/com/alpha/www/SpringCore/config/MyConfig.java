package com.alpha.www.SpringCore.config;

import com.alpha.www.SpringCore.package1.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean(name = "samosa1")
//	@Primary
    public Samosa getSamosa1(){
        System.out.println("samosa 1");
        return new Samosa("samosa 1");
    }

    @Bean(name = "samosa2")
//	@Primary
    public Samosa getSamosa2(){
        System.out.println("samosa 2");
        return new Samosa("samosa 2");
    }
}
