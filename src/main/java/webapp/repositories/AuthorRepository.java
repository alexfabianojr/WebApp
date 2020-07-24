package webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
