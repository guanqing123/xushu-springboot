package org.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * @author guanqing
 * @since 2025/3/15
 */
public class JettyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            Objects.requireNonNull(context.getClassLoader())
                    .loadClass("org.eclipse.jetty.util.Jetty");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
