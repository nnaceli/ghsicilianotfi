package models;

public class Degree {
	private int id;
	private String name;
	private String insitution;
	private int year;
	
	public Degree() {}

	public Degree(int id, String name, String insitution, int year) {
		this.id = id;
		this.name = name;
		this.insitution = insitution;
		this.year = year;
	}
	
}
