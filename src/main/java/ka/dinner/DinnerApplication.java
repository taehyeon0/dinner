package ka.dinner;

import ka.dinner.config.MyBatisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MyBatisConfig.class)
@SpringBootApplication(scanBasePackages = "ka.dinner.controller")
public class DinnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DinnerApplication.class, args);
	}

}
