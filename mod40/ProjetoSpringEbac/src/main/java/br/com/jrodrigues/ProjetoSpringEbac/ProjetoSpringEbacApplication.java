package br.com.jrodrigues.ProjetoSpringEbac;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.jrodrigues.ProjetoSpringEbac.domain.Games;
import br.com.jrodrigues.ProjetoSpringEbac.repository.IGamesRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.jrodrigues.ProjetoSpringEbac.repository")
@EntityScan("br.com.jrodrigues.ProjetoSpringEbac.*")
@ComponentScan(basePackages = "br.com.jrodrigues.ProjetoSpringEbac")
public class ProjetoSpringEbacApplication implements CommandLineRunner{

	private static Logger log = LoggerFactory.getLogger(ProjetoSpringEbacApplication.class);
	
	@Autowired
	private IGamesRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringEbacApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Games games = createGames();
		repository.save(games);
	}

	private Games createGames() {
		return Games.builder()
				.gender("Ação/sobrevivência")
				.tittle("The Last of Us")
				.price(250.0)
				.build();
	}

}
