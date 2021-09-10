package shop.cofin.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.cofin.oracle.book.domain.BookDTO;

@Repository
public interface BookMapper {
	public List<BookDTO> findAll();
	

}
