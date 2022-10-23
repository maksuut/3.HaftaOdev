package oopWithNLayeredApp.entities;

public class Category {
	private String name;
	private int id;
	private String description;

	public Category() {
		super();
	}

	public Category(String name, int id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
