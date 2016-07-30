package cn.org.japd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class Application {
	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
