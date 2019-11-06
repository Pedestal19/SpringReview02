package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: spring5webapp.
 * Date: 11/6/2019.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
