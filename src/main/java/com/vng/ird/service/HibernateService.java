package com.vng.ird.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HibernateService {

	@Value("${name:unknown}")
	private String name;

	public String getMessage() {
		return getMessage(name);
	}

	public String getMessage(String name) {
		return "Hello " + name;
	}

}
