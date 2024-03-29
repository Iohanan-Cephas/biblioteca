package library;

public class Book {
	private String title;
	private String author;
	private String gender;
	
	public Book() {
	}
	
	public Book(String t, String a, String g) {
		title = t;
		author = a;
		gender = g;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getGender() {
		return gender;
	}
	
	
}
