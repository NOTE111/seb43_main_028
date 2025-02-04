package backend.section6mainproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
public class Section6MainProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section6MainProjectApplication.class, args);
	}

//이 테스트는 for action 폴더만 만들었음 gg
}
//