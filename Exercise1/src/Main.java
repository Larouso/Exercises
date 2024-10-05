
public class Main {

	public static void main(String[] args) {
		Book b = new Book();
		b.setISBN(220304030);
		b.setTitle("Head First Java");
		b.setAuthor("George Bratsos");
		b.setNumber_of_pages(700);
		b.setPublishing_house("Oracle");
		b.setPrice(700.36);
		b.setYear_of_publication(2022);
		b.printAll();
		System.out.println("---------------------------------------------");
		System.out.println("Price without tax: " + b.priceAfterTax());
		System.out.println("---------------------------------------------");
		System.out.println("Price of rights: " + b.copyRights());
	}

}
