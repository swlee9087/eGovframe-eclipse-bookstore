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
	@Override
 	public BookDTO findById(int bookId){		
		return bookMapper.findById(bookId);
	}
	@Override
 	public BookDTO findByPubId(int pubId){		
		return bookMapper.findByPubId(pubId);
	}
	@Override
 	public BookDTO findByBookTitle(String bookTitle){		
		return bookMapper.findByBookTitle(bookTitle);
	}
	@Override
 	public BookDTO findByPrice(int price){		
		return bookMapper.findByPrice(price);
	}
}

