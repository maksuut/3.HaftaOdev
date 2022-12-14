package oopWithNLayeredApp.entities;

public class Instructor {
	private String name;
	private String surname;
	private int id;

	public Instructor() {
		
	}

	public Instructor(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.id = age;
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

	public int getAge() {
		return id;
	}

	public void setAge(int age) {
		this.id = age;
	}
}
