package shop.cofin.oracle.book.service;
import java.util.List;

import org.springframework.stereotype.Component;

import shop.cofin.oracle.book.domain.BookDTO;

@Component
public interface BookService {
	public List<BookDTO> findAll();
	
}
