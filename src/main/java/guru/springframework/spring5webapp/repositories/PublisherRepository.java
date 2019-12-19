package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vebjorn
 * Date: 25/04/2022, Monday
 * Time: 15:59
 **/
public interface PublisherRepository extends CrudRepository <Publisher, Long> {
}
