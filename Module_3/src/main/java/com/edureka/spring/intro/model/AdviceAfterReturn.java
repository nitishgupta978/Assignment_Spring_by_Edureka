package com.edureka.spring.intro.model;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author nitish.gupta_spicemo
 */
public class AdviceAfterReturn implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Here you can write the code execute after the actual methods execution");

	}

}
