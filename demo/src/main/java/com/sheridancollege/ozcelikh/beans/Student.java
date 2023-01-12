package com.sheridancollege.ozcelikh.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
	
	private String name;
	private int id;
	private double grade;
	private String letterGrades;

	
}
