package com.learning.liber.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class CorsDisable implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
<<<<<<< HEAD
        registry.addMapping("/**").allowedHeaders("*").allowedMethods("*");
    }
}
=======
        registry.addMapping("/**");
    }
}
>>>>>>> 0249f3a87331ac2061651145e4e0747f7093e4fe
