package com.lugercocas.dashsim.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lugercocas.dashsim.bean.MyBeanLogin;
import com.lugercocas.dashsim.bean.MyBeanLoginImplement;

@Configuration
public class MyConfigurationBeanLogin {
    @Value("${value.nombre}")
    private String nombre;

    @Value("${value.apellido}")
    private String apellido;

    @Value("${value.random}")
    private String random;

    @Bean
    public MyBeanLogin functionLogin() {
        return new MyBeanLoginImplement(nombre, apellido);
    }
}
