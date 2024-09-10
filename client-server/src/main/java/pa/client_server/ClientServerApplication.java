package pa.client_server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ClientServerApplication implements CommandLineRunner {

	@Value("${name}")
	String name;

	public static void main(String[] args) {
		SpringApplication.run(ClientServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(name);
	}
}
