package com.example.form.demoForm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Register
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		String name;
		int age;
		
		
		
}
