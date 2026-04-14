    package com.bai2.config;

    import jakarta.servlet.MultipartConfigElement;
    import jakarta.servlet.ServletRegistration;
    import org.jspecify.annotations.Nullable;
    import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

    public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?> @Nullable [] getRootConfigClasses() {
            return new Class[0];
        }

        @Override
        protected Class<?> @Nullable [] getServletConfigClasses() {
            return new Class[]{WebInit.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }
    }


