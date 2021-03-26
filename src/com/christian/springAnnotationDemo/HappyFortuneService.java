package com.christian.springAnnotationDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Value("${goodFortunes}")
	private String[] goodFortunes;
	@Override
	public String getFortune() {
		return "Get Lit.";
	}

}
