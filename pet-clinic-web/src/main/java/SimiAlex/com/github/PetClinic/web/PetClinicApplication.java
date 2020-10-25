package SimiAlex.com.github.PetClinic.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("SimiAlex.com.github.PetClinic")
@ComponentScan(basePackages = {"SimiAlex.com.github.PetClinic"})
@EntityScan("SimiAlex.com.github.PetClinic")
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
