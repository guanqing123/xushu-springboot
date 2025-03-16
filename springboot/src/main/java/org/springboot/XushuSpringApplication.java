package org.springboot;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class XushuSpringApplication {

    public static void run(Class clazz){
        //todo
        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
        webApplicationContext.register(clazz);
        //启动容器
        webApplicationContext.refresh();

        // 创建 web服务器 内嵌tomcat 写死 jetty,undertow
        // createTomcat(webApplicationContext);
        createWebServer(webApplicationContext);
    }

    private static void createWebServer(AnnotationConfigWebApplicationContext webApplicationContext) {
        WebServer webServer = webApplicationContext.getBean(WebServer.class);
        webServer.onStart();
    }

    // private static void createTomcat(AnnotationConfigWebApplicationContext applicationContext) {
    //     Tomcat tomcat = new Tomcat();
    //
    //     Server server = tomcat.getServer();
    //     Service service = server.findService("Tomcat");
    //
    //     Connector connector = new Connector();
    //     connector.setPort(8080);
    //
    //     Engine engine = new StandardEngine();
    //     engine.setDefaultHost("localhost");
    //
    //     Host host = new StandardHost();
    //     host.setName("localhost");
    //
    //     String contextPath = "";
    //     Context context = new StandardContext();
    //     context.setPath(contextPath);
    //     context.addLifecycleListener(new Tomcat.FixContextListener());
    //
    //     host.addChild(context);
    //     engine.addChild(host);
    //
    //     service.setContainer(engine);
    //     service.addConnector(connector);
    //
    //     tomcat.addServlet(contextPath, "dispatcher", new DispatcherServlet(applicationContext));
    //     context.addServletMappingDecoded("/*", "dispatcher");
    //
    //     try {
    //         tomcat.start();
    //         tomcat.getServer().await();
    //     } catch (LifecycleException e) {
    //         e.printStackTrace();
    //     }
    // }
}