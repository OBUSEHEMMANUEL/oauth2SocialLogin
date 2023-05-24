package com.emmanuel.oauth2.oauth2sociallogin.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      return   http
              .csrf().disable()
              .authorizeHttpRequests()
              .anyRequest()
              .authenticated()
              .and()
              .oauth2Login()
    }
}
