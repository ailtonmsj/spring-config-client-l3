package br.com.amsj.spring.cloud.l3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyController {

	@Value("${key-test-1}")
	String keyTest1;
	
	@Value("${key-test-2}")
	String keyTest2;
	
	@Value("${key-test-3}")
	String keyTest3;

	@GetMapping("/keytesteone")
	public String keyTest1() {
		return "The key-test-1: " + keyTest1;
	}
	
	@GetMapping("/keytestetwo")
	public String keyTest2() {
		return "The key-test-2: " + keyTest2;
	}
	
	@GetMapping("/keytestethree")
	public String keyTest3() {
		return "The key-test-3: " + keyTest3;
	}
}