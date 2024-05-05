package guru.springframework.spring6reactive.repository;

import guru.springframework.spring6reactive.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {


}
