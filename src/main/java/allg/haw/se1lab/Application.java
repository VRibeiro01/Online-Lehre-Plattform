package allg.haw.se1lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Als Springboot Application markieren
public class Application {

	public static void main(String[] args) { // Springbooot startet die Anwendung und die Datenbank und lässt sie weiterlaufen
		SpringApplication.run(Application.class, args);
	}

}
