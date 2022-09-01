package com.niraj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/")
	public String welcome() {
		return "Github Actions - Niraj";
	}

	@GetMapping("/site/{s}")
	public String siteName(@PathVariable("s") String site) {
		System.out.println("Site requested ==> " + site);
		return "Your requested site "+ site;
	}
}

