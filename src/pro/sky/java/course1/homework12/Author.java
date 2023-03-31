package pro.sky.java.course1.homework12;

public class Author {
	private String firstName;
	private String secondName;

	public Author(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	@Override
	public String toString() {
		return "Автор: " + firstName + " " + secondName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Author author2 = (Author) obj;
		return firstName.equals(author2.firstName) && secondName.equals(author2.secondName);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(firstName, secondName);

	}
}

