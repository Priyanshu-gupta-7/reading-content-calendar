package com.priyanshu.contentcalendar;

import com.priyanshu.contentcalendar.config.ContentCalenderProperties;
import com.priyanshu.contentcalendar.model.Content;
import com.priyanshu.contentcalendar.model.Status;
import com.priyanshu.contentcalendar.model.Type;
import com.priyanshu.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalenderProperties.class)
//
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
