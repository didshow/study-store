package config;

import interceptor.MyInteceptor;
import interceptor.MyInteceptor1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by wangchao on 2021/11/30.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"controller"})
@EnableAspectJAutoProxy
public class SpringMVCConfig  implements WebMvcConfigurer {
    /**
     * config view resolver
     */

    @Bean
    public InternalResourceViewResolver getViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }


    /**
     * config static resource
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/");
    }

    @Bean
    public MyInteceptor myInteceptor(){
        return new MyInteceptor();
    }

    @Bean
    public MyInteceptor1 myInteceptor1(){
        return new MyInteceptor1();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInteceptor());
        registry.addInterceptor(myInteceptor1());
    }
}
