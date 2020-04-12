package net.javaguides.springmvc.helloworld.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MainWebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(final ServletContext servletContext) throws ServletException {
 
        AnnotationConfigWebApplicationContext ctx =  new AnnotationConfigWebApplicationContext();
         
//        root.scan("com.baeldung");
//        servletContext.addListener(new ContextLoaderListener(ctx));
        
        ctx.register(PrhasWebAppConfig.class);
        ctx.register(AasWebAppConfig.class);
        ctx.setServletContext(servletContext);
        
        ServletRegistration.Dynamic appServlet =  
        		servletContext.addServlet("mvc", new DispatcherServlet(ctx));
        appServlet.setLoadOnStartup(1);
//        appServlet.addMapping("/prhas/*");
        appServlet.addMapping("/");
    }
}
