package com.te.steamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

;

public class MyEmployeClass {
public static void main(String[] args) {
	
	List<Employe> asList = Arrays.asList(new Employe("vivek", 2000, 30),
			                              new Employe("Harish", 200, 20),
			                              new Employe("Sunitha", 20000, 40));
	asList.stream().sorted(Comparator.comparing(Employe::getSalary)).collect(Collectors.toList()).forEach(System.out::println);

	
}
}
