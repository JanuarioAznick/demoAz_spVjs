package com.demoAz.demo.Entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import  lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Client implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String nome;
	
	
	

}
 