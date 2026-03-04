package apicontractdesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
* Spring Boot 애플리케이션 진입점
* - 레이어드 아키텍처에서 모든 Bean 스캔의 시작점
*/
@SpringBootApplication
public class ApicontractdesignApplication { 
    public static void main(String[] args) {
        SpringApplication.run(ApicontractdesignApplication.class, args); 
    }
}