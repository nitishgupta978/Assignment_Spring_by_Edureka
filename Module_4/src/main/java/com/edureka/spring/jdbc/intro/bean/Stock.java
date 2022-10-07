package com.edureka.spring.jdbc.intro.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author nitish.gupta_spicemo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Stock {
	private String name;
	private String category;
	private int number;
}
