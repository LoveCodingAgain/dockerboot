package com.lixing.docker.dockerboot;
import de.codecentric.boot.admin.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
@Configuration
@EnableAdminServer
@EnableAsync
@EnableScheduling
@SpringBootApplication
@MapperScan("com.lixing.docker.dockerboot.mapper")
public class DockerbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerbootApplication.class, args);
        DockerbootApplication dockerbootApplication = new DockerbootApplication();
	}
}
