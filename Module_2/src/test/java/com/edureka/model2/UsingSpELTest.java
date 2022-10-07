package com.edureka.model2;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSpELTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextSpEL.xml");
		
		UsingSpEL useSpEL = context.getBean("useSpEL", UsingSpEL.class);
		Assertions.assertThat(useSpEL).isNotNull();
		
		System.out.println("isEqaulChk : "+useSpEL.isEqualChk());
		System.out.println("getConcat : "+useSpEL.getConcat());
		System.out.println("getExponent : "+useSpEL.getExponent());
	}

}
