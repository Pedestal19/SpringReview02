package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: spring5webapp.
 * Date: 11/6/2019.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
