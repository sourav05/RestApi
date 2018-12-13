package com.example.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@PostMapping("/done")
	public String postMethod(@RequestBody TestTO to){
		return "Done!!!" + " " + to.getName();
	}
	
	@GetMapping("/done")
	public String getMethod(){
		return "Done!!!";
	}
}
