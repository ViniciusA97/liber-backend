package com.learning.liber.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class CorsDisable implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
<<<<<<< HEAD
        registry.addMapping("/**").allowedMethods("*");
=======
<<<<<<< HEAD
        registry.addMapping("/**").allowedHeaders("*").allowedMethods("*");
    }
}
=======
        registry.addMapping("/**");
>>>>>>> 735315a0b14ebfccac6f2e9a7c6003aa06dc3262
    }
}
>>>>>>> 0249f3a87331ac2061651145e4e0747f7093e4fe
