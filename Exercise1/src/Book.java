public class Book {
	private long isbn;
	private String title;
	private String author;
	private int number_of_pages;
	private String publishing_house;
	private double price;
	private int year_of_publication;
	
	public long getISBN() {
		return isbn;
	}
	public void setISBN(long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNumber_of_pages() {
		return number_of_pages;
	}
	public void setNumber_of_pages(int number_of_pages) {
		this.number_of_pages = number_of_pages;
	}
	public String getPublishing_house() {
		return publishing_house;
	}
	public void setPublishing_house(String publishing_house) {
		this.publishing_house = publishing_house;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear_of_publication() {
		return year_of_publication;
	}
	public void setYear_of_publication(int year_of_publication) {
		this.year_of_publication = year_of_publication;
	}
	
	public void printAll() {
		System.out.println("ISBN: " + isbn + "\n" + "title: " + title + "\n" + "Author: " + author + "\n" +
	"Number of pages: " + number_of_pages + "\n" + "Publishing House: " + publishing_house + "\n" + "Price: " +
				price + "\n" + "Year of publication: " + year_of_publication);
	}
	
	public double priceAfterTax() {
		return price / 1.24;
	}
	
	public double copyRights() {
		double price_of_rights = 0.0;
		if(number_of_pages < 100) {
			price_of_rights = priceAfterTax() * 0.02;
		}
		else if(number_of_pages >= 100 && number_of_pages < 300) {
			price_of_rights = priceAfterTax() * 0.05;
		}
		else if(number_of_pages > 300) {
			price_of_rights = priceAfterTax () * 0.08;
		}
		else {
			System.out.println("No pages found to count the copy rights price");
		}
		return price_of_rights;
	}
}
