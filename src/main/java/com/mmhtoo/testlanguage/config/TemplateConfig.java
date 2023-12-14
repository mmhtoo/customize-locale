// package com.mmhtoo.testlanguage.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.thymeleaf.spring6.SpringTemplateEngine;
// import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
// import org.thymeleaf.spring6.view.ThymeleafViewResolver;

// @Configuration
// @EnableWebMvc
// public class TemplateConfig {
  
//   @Bean
//   public SpringTemplateEngine springTemplateEngine(){
//     SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//     templateEngine.setTemplateResolver(springResourceTemplateResolver());
//     return templateEngine;
//   }

//   @Bean
//   public SpringResourceTemplateResolver springResourceTemplateResolver(){
//     SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//     templateResolver.setPrefix("classpath:templates/");
//     templateResolver.setSuffix(".html");
//     templateResolver.setTemplateMode("HTML5");
//     return templateResolver;
//   }

//   @Bean
//   public ThymeleafViewResolver thymeleafViewResolver(){
//     ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
//     thymeleafViewResolver.setTemplateEngine(springTemplateEngine());
//     return thymeleafViewResolver;
//   }

// }
