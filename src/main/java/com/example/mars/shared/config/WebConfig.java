package com.example.mars.shared.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 모든 요청에 대해 CORS 허용 (특정 URL이나 메소드에 대해서만 제한 가능)
        registry.addMapping("/**") // 모든 엔드포인트에 대해 CORS를 허용
                .allowedOrigins("http://localhost:5173") // 허용할 도메인 (프론트엔드의 URL)
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메소드
                .allowedHeaders("*") // 허용할 헤더
                .allowCredentials(true); // 쿠키나 인증 정보를 포함하도록 설정 (필요시)
    }
}
