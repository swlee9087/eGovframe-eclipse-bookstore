package shop.cofin.oracle.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.book.domain.BookDTO;
import shop.cofin.oracle.book.service.BookService;

@Controller
public class BookController {

	@Autowired BookService bookService;
	
	@RequestMapping("/books")
	public void findAll() {
		List<BookDTO> books = bookService.findAll();
		for(BookDTO book : books) {
			System.out.println(book.toString());
		}
	}
	@RequestMapping("/books/bookId/{bookId}")
	public void findById (@PathVariable int bookId) {
		BookDTO books = bookService.findById(bookId);
		System.out.println(books.toString());
	}
	@RequestMapping("/books/pubId/{pubId}")
	public void findByPubId (@PathVariable int pubId) {
		BookDTO books = bookService.findByPubId(pubId);
		System.out.println(books.toString());
	}
	@RequestMapping("/books/bookTitle/{bookTitle}")
	public void findByBookTitle (@PathVariable String bookTitle) {
		BookDTO books = bookService.findByBookTitle(bookTitle);
		System.out.println(books.toString());
	}
	@RequestMapping("/books/price/{price}")
	public void findByPrice (@PathVariable int price) {
		BookDTO books = bookService.findByPrice(price);
		System.out.println(books.toString());
	}
}
