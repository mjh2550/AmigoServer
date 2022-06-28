package com.spring.amigo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc

public class ViewReolver extends WebMvcConfigurerAdapter {
        @Bean
        public ViewResolver getViewResolver() {
            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
            resolver.setPrefix("classpath:/templates/");
            resolver.setSuffix(".html");
            return resolver;
        }

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/img/**",
                            "/css/**",
                            "/js/**")
                    .addResourceLocations("classpath:/static/img/",
                            "classpath:/static/css/",
                            "classpath:/static/js/");
        }

}