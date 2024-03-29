package com.niraj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/")
	public String welcome() {
		return "Github Actions - Niraj - 6 | 22-04-2024 ";
	}

	@GetMapping("/site/{s}")
	public String siteName(@PathVariable("s") String site) {
		System.out.println("Site requested ==> " + site);
		return "Your requested site "+ site;
	}
	
	@GetMapping("/news/{t}")
	public String newsType(@PathVariable("t") String type) {
		System.out.println("News Type in Request 222 ==> " + type);
		return "News Type "+ type;
	}

	@GetMapping("/product/{t}")
	public String productType(@PathVariable("t") String type) {
		System.out.println("Product Type for Ecommerce in Request ==> " + type);
		return "Product Type "+ type;
	}


}

