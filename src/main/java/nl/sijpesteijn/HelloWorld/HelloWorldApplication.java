package nl.sijpesteijn.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@Controller
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}


	@GetMapping("/{name}")
	public ResponseEntity<String> sayHello(@PathVariable("name") String name) {
		return ResponseEntity.ok("Hello there Knative Traveller: " + name);
	}

	@GetMapping
	public ResponseEntity<String> say() {
		return ResponseEntity.ok("Default!");
	}
}
