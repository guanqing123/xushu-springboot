package org.xushu;

import org.springboot.*;
import org.springframework.context.annotation.Import;

@XushuSpringBootApplication
// @Import({ WebServerAutoConfiguration.class})
@Import({MyImportSelector.class})
public class MyApplication {
    public static void main(String[] args) {
        XushuSpringApplication.run(MyApplication.class);
    }
}