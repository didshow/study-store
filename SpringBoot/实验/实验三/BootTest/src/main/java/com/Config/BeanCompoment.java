package com.Config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;


@Configuration
public class BeanCompoment implements ErrorPageRegistrar {
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        //将404页面转发到"/"
        ErrorPage error404 = new ErrorPage(HttpStatus.NOT_FOUND, "/");
        registry.addErrorPages(error404);

    }
}
