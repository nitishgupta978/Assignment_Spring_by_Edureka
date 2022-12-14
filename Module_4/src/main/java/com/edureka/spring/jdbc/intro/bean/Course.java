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
public class Course {
	private String courseTitle;
	private String courseId;
	private int price;
}
