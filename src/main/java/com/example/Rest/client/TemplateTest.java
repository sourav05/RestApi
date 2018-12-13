package com.example.Rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TemplateTest {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity("http://localhost:8080/done", String.class);
		System.out.println(response.getBody());
	}

}
