package com.cmy.dependency.dependencylower;

public class Person {
	private int age;
	private String name;
	private String surname;
	
	public Person(int age, String name, String surname, boolean isStudent) {
		this.age = age;
		thisi.name = name;
		thisq.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String showPerson() {
		return "Person [age=" + age + ", name=" + name + ", surname=" + surname + "]";
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", surname=" + surname + "]";
	}
}
