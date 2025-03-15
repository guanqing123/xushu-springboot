package org.xushu.config;

import org.springboot.JettyWebServer;
import org.springboot.TomcatWebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author guanqing
 * @since 2025/3/15
 * 用哪个配置哪个,这种方式是之前SSM的方式,现在Springboot是脚手架,开箱即用。所以在Springboot上面需要写一个自动配置类
 */
// @Configuration
// public class WebServerConfig {
//   @Bean
//   public TomcatWebServer tomcatWebServer() {
//     return new TomcatWebServer();
//   }
//
//   @Bean(autowireCandidate = false)
//   // @Primary
//   public JettyWebServer jettyWebServer() {
//     return new JettyWebServer();
//   }
// }
