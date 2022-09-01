package com.niraj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/")
	public String welcome() {
		return "Github Actions - Niraj - 3";
	}

	@GetMapping("/site/{s}")
	public String siteName(@PathVariable("s") String site) {
		System.out.println("Site requested ==> " + site);
		return "Your requested site "+ site;
	}
	
	@GetMapping("/news/{t}")
	public String newsType(@PathVariable("t") String type) {
		System.out.println("News Type in Request ==> " + type);
		return "News Type "+ type;
	}

	@GetMapping("/college/{t}")
	public String college(@PathVariable("t") String college) {
		System.out.println("College ==> " + college);
		return "College =>  "+ college;
	}
	
	@GetMapping("/aws/{w}")
	public String amazon(@PathVariable("w") String aws) {
		System.out.println("AWS Service ==> " + aws);
		return "AWS Service =>  "+ aws;
	}
	

}

