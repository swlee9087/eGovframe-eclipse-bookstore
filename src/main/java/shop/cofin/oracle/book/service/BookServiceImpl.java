package shop.cofin.oracle.book.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.cofin.oracle.book.domain.BookDTO;
import shop.cofin.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper bookMapper;
	
	@Override
 	public List <BookDTO> findAll(){		
		return bookMapper.findAll();
	}
}

