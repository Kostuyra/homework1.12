package pro.sky.java.course1.homework12;

public class Book {
	private String name;
	private Author author;
	private int yearPublication;

	public Book(String name, Author author, int yearPublication){
		this.name = name;
		this.author = author;
		this.yearPublication = yearPublication;

	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public int getYearPublication() {
		return yearPublication;
	}

	public void setYearPublication(int year){
		this.yearPublication = year;
	}
}
