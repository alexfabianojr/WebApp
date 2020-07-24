package webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
