package com.christian.springAnnotationDemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "S.A.D.B.O.Y.S";
	}

}
