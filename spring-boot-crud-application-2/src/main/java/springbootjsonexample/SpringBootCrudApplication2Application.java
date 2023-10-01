package springbootjsonexample;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudApplication2Application {

	public static Logger logger=LoggerFactory.getLogger(SpringBootCrudApplication2Application.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started...  ");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed...  ");
		SpringApplication.run(SpringBootCrudApplication2Application.class, args);
	}

}
