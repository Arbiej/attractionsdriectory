package pl.br.attractiondirectory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.br.attractiondirectory.attraction.Attraction;

@Repository
public interface AttractionRepository extends CrudRepository<Attraction, Long> {
}
