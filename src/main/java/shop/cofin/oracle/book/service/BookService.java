package shop.cofin.oracle.book.service;
import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.book.domain.BookDTO;

@Component
public interface BookService {
	public List<BookDTO> findAll();
	public BookDTO findById(int bookId);
	public BookDTO findByPubId(int pubId);
	public BookDTO findByBookTitle(String bookTitle);
	public BookDTO findByPrice(int price);
}
