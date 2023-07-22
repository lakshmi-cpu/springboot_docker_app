package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping
	public String getWelcomeMessage()
	{
		return "WELCOME TO ASHOK IT INSTITUTE...!!";
	}

}
