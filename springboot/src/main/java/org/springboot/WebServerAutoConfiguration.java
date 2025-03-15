package org.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author guanqing
 * @since 2025/3/15
 */
@Configuration
public class WebServerAutoConfiguration {

    @Bean
    @Conditional(TomcatCondition.class)
    public TomcatWebServer tomcatWebServer() {
        return new TomcatWebServer();
    }

    @Bean
    @Conditional(JettyCondition.class)
    public JettyWebServer jettyWebServer() {
        return new JettyWebServer();
    }
}
