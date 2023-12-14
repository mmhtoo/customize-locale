package com.mmhtoo.testlanguage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

  private final LocaleChangeInterceptor localeChangeInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(localeChangeInterceptor);
  }
  
}
