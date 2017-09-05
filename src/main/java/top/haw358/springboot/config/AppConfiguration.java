package top.haw358.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import top.haw358.springboot.pojo.User;
import top.haw358.springboot.security.SpringSecurityAuditorAware;

/**
 * Created by haw on 17-8-30.
 */
@Configuration
@EnableWebMvc
//@EnableJpaAuditing
@EnableSpringDataWebSupport
@EnableJpaRepositories(basePackages = "top.haw358.springboot.repositories.jpa")
class AppConfiguration {

//    @Bean
//    public AuditorAware<User> auditorProvider() {
//        return new SpringSecurityAuditorAware();
//    }
}
