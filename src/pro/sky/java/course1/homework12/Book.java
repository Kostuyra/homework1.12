package pro.sky.java.course1.homework12;

public class Book {
	private String name;
	private Author author;
	private int yearPublication;

	public Book(String name, Author author, int yearPublication) {
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

	public void setYearPublication(int year) {
		this.yearPublication = year;
	}

	@Override
	public String toString() {
		return "Название: " + name + "\n" + author.toString() + "\n" + "Год издания: " + yearPublication;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Book book2 = (Book) obj;
		return name.equals(book2.name) && author.equals(book2.author) && yearPublication == book2.yearPublication;
	}

	@Override
	public int hashCode(){
		return java.util.Objects.hash(name, yearPublication) + author.hashCode();
	}
}
