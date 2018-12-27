package com.springboot.config;

import com.springboot.security.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author: withlzc
 * @Description:
 * @Date: Created in 2018/12/27 0027 16:54
 */

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService customUserService() {
        return new CustomUserService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService()).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error")
                .permitAll()
                .and()
                .logout().permitAll();
    }

//    public static void main(String[] args) {
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        //加密"lzc"
//        String encodelzc = bCryptPasswordEncoder.encode("lzc");
//        //加密"test"
//        String encodetest = bCryptPasswordEncoder.encode("test");
//        System.out.println(encodelzc);
//        System.out.println(encodetest);
//
//        //结果：
//        //lzc:  $2a$10$ESRaVCGuIV/mIqDDBlCGaOopq3lzLo07XHteBVzwhSVtLKP.v39CK
//        //test: $2a$10$E33yqYlsMRbYPga7XCrb..L72uQZ1YkeZm6b/syIu61.KUgtSaF1K
//    }
}


