package dev.cooeeu.demo.spring6

import org.springframework.context.ApplicationContextAware
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer
import org.springframework.web.servlet.view.freemarker.FreeMarkerView
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver

@Configuration
@EnableWebMvc
@ComponentScan('dev.cooeeu.demo.spring6')
class DemoWebConfig implements WebMvcConfigurer {

    @Override
    void configureViewResolvers(ViewResolverRegistry registry) {
        registry.viewResolver(viewResolver())
    }

    @Bean
    FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = new FreeMarkerConfigurer()
        configurer.setTemplateLoaderPath('/WEB-INF/freemarker')
        configurer.setDefaultEncoding('UTF-8')

        configurer
    }

    @Bean
    FreeMarkerViewResolver viewResolver() {
        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver()
        viewResolver.setViewClass(FreeMarkerView.class)
        viewResolver.setSuffix('.ftl')
        viewResolver.setCache(true)
        viewResolver.setContentType('text/html;charset=UTF-8')

        viewResolver
    }
}
