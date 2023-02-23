package com.example.sample_GG1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/hello")
public String hello()
{
	return" Naaa Mass uhh Daa...";
}
}
