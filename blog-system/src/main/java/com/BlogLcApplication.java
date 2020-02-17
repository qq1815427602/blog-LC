package com;

import com.security.config.IgnoreUrlsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



/*@EnableConfigurationProperties({
        IgnoreUrlsConfig.class
})*/
@SpringBootApplication
public class BlogLcApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogLcApplication.class, args);
    }

}
