package aa.bb.ccc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(ContentRepository repository) {
        return (args) -> {
            // save two contents
            repository.save(new Content(1l, "name1", "title1", "description1"));

            // fetch all Contents
            log.info("Contents found with findAll():");

            for (Content eachContent : repository.findAll()) {
                log.info(eachContent.toString());
            }
            log.info("");
        };
    }
}
