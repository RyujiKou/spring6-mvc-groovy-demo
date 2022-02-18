package dev.cooeeu.demo.spring6

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

class DemoWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        null
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        [DemoWebConfig.class]
    }

    @Override
    protected String[] getServletMappings() {
        ['/']
    }
}
