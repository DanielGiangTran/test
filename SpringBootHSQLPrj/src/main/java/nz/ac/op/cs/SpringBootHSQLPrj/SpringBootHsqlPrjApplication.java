package nz.ac.op.cs.SpringBootHSQLPrj;

import nz.ac.op.cs.SpringBootHSQLPrj.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHsqlPrjApplication {
	@Bean
	public UserService getUserService() {
		return new UserService();

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHsqlPrjApplication.class, args);
	}

}
