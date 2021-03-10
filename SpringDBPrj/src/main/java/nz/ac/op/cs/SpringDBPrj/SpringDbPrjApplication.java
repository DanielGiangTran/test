package nz.ac.op.cs.SpringDBPrj;

import nz.ac.op.cs.SpringDBPrj.db.QuizUserRepository;
import nz.ac.op.cs.SpringDBPrj.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringDbPrjApplication {
	@Bean
	public UserService getUserService() {
		return new UserService();

	}
@Bean
public RestTemplate restTemplate(){
		return new RestTemplate();
}


	public static void main(String[] args) {
		SpringApplication.run(SpringDbPrjApplication.class, args);
	}

}
