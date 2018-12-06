package sample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DataInRepository extends CrudRepository<DataJPA, Long> {
}
