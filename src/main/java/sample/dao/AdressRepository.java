package sample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdressRepository extends CrudRepository<DataAdress, Long> {

}
