package person.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController("/hello")
public class PersonController {

	@GetMapping
	public String hello() {
		return "Hello00";
	}

}
