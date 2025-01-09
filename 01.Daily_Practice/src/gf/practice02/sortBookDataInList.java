package gf.practice02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class BookLibrary {

	private int bookId;
	private String bookName;
	private int bookPrice;

	public BookLibrary(int bookId, String bookName, int bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public BookLibrary() {

	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return " (" + bookId + "  " + bookName + "  " + bookPrice + " ) ";
	}

}

public class sortBookDataInList {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		
		List<BookLibrary> library = new ArrayList<BookLibrary>();

		library.add(new BookLibrary(103, "Java", 5000));
		library.add(new BookLibrary(101, "Spring", 10000));
		library.add(new BookLibrary(105, ".Net", 2000));
		library.add(new BookLibrary(104, "Python", 3000));
		library.add(new BookLibrary(102, "MySQL", 900));

		do {
			System.out.println("1.Sort By Book Name : ");
			System.out.println("2.Sort By Book Id : ");
			System.out.println("3.Sort By Book Price : ");
			System.out.println("4.Exit");
			System.out.println("============================");
			System.out.println();

			System.out.println("Enter Your Choice :: ");
			int choice = scn.nextInt();
			System.out.println();
			

			switch (choice) {

			case 1:
				library.sort((BookLibrary o1, BookLibrary o2)->o1.getBookName().compareTo(o2.getBookName()));
				System.out.println("Sorting Book By Name Wise :: ");
				System.out.println("----------------------------");
				library.forEach(book -> System.out.println(book));
				System.out.println();

				break;

			case 2:
				library.sort((BookLibrary o1, BookLibrary o2)->o1.getBookId() - o2.getBookId());
				System.out.println("Sorting Book By Id Wise :: ");
				System.out.println("----------------------------");
				library.forEach(book -> System.out.println(book));
				System.out.println();

				break;

			case 3:
				library.sort((BookLibrary o1, BookLibrary o2)->o1.getBookPrice() - o2.getBookPrice());
				System.out.println("Sorting Book By Price Wise :: ");
				System.out.println("----------------------------");
				library.forEach(book -> System.out.println(book));
				System.out.println();

				break;

			case 4:
				System.out.println("Thank You 😊 Visit Again...");
				System.exit(0);

			}

		} while (true);

	}
}
