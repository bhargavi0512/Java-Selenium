package mypackage;

public class BookDetails {
	    String title;
	    String author;
	    int year;
	    double price;

	    void addBookDetails(String t, String a, int y, double p) {
	        title = t;
	        author = a;
	        year = y;
	        price = p;
	    }

	    void displayBookDetails() {
	        System.out.println(" Book Details ");
	        System.out.println("Title  : " + title);
	        System.out.println("Author : " + author);
	        System.out.println("Year   : " + year);
	        System.out.println("Price  : ₹" + price);
	    }

	    public static void main(String[] args) {

	        BookDetails book1 = new BookDetails();

	        book1.addBookDetails("The power of your subconscious mind", "Joseph", 1990, 250);

	        book1.displayBookDetails();
	    }
	}


