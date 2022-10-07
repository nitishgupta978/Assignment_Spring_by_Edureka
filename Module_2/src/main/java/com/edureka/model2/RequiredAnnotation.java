package com.edureka.model2;

import org.springframework.beans.factory.annotation.Required;

public class RequiredAnnotation {

	public int value;

	public int getValue() {
		return value;
	}

	@Required
	public void setValue(int value) {
		this.value = value;
	}
}
