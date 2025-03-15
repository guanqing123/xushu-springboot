package org.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * @author guanqing
 * @since 2025/3/15
 */
public class TomcatCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // todo
        // 类加载 加载tomcat jar一个核心类
        // 如果能加载到说明当前依赖了tomcat的jar包
        try {
            Objects.requireNonNull(context.getClassLoader())
                    .loadClass("org.apache.catalina.startup.Tomcat");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
