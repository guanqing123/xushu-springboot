package org.springboot;

/**
 * @author guanqing
 * @since 2025/3/15
 */
public class TomcatWebServer implements WebServer{
    @Override
    public void onStart() {
        System.out.println("启动tomcat");
    }
}
