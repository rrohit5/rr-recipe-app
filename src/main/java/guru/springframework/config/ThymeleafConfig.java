package guru.springframework.config;
//package com.recipe.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Description;
//import org.springframework.core.Ordered;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring5.view.ThymeleafViewResolver;
//
//
//@Configuration
//public class ThymeleafConfig {
//
//    @Bean
//    @Description("Thymeleaf Template Resolver")
//    public SpringResourceTemplateResolver  templateResolver() {
//    	SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver ();
//        resolver.setPrefix("classpath:/templates/");
//        resolver.setSuffix(".html");
//        resolver.setTemplateMode("HTML5");
//        resolver.setCharacterEncoding("UTF-8");
//        resolver.setCacheable(false);
//        return resolver;
//    }
//    
//    @Bean
//    @Description("Thymeleaf Template Engine")
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
////        templateEngine.setTemplateEngineMessageSource(messageSource());
//        return templateEngine;
//    }
//    
//    @Bean
//    @Description("Thymeleaf View Resolver")
//    public ThymeleafViewResolver viewResolver() {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine());
//        viewResolver.setCharacterEncoding("UTF-8");
//        viewResolver.setContentType("text/html");
//        viewResolver.setOrder(Ordered.LOWEST_PRECEDENCE - 5);
//        return viewResolver;
//    }
//
//  
//}
