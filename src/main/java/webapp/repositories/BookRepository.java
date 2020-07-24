package webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
