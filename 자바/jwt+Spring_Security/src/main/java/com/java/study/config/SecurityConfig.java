package com.java.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // -> 설정 클래스
public class SecurityConfig{

    @Bean // -> 빈으로 등록
    @SuppressWarnings("Convert2MethodRef")
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // CSRF 비활성화 (Spring security 6.1부터 csrf 호출 방식 변경)
                .authorizeHttpRequests((authorizeRequests) ->
                        authorizeRequests
                                .requestMatchers("/api/hello").permitAll() // '/api/hello' 인증없이 접근 가능
                                .anyRequest().authenticated() // 그 외 요청은 인증 필요
                );
        return http.build();
    }
    
}
