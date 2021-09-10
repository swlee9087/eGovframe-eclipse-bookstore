package shop.cofin.oracle.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.cofin.oracle.book.domain.BookDTO;
import shop.cofin.oracle.book.service.BookService;

@Controller
public class BookController {

	@Autowired BookService bookService;
	
	@RequestMapping("/books")
	public void findAll() {
		List<BookDTO> list = bookService.findAll();
		for(BookDTO b : list) {
			System.out.println(b.toString());
		}
	}
}
