package com.tedblob.spring.mvc.requestParam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class RequestParamApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RequestParamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Map<String, String> values = new HashMap<>();
		values.put("A", "Apple");
		values.put("A", "Amla");
		System.out.println("Map values : " + values);
		MultiValueMap<String, String> formValues = new LinkedMultiValueMap<String, String>();
		formValues.add("B", "Banana");
		formValues.add("B", "Barley");

		formValues.add("A", "Apple");
		formValues.add("A", "Akebi");
		formValues.add("A", "Amla");
		System.out.println("Form values : " + formValues);
	}
}
