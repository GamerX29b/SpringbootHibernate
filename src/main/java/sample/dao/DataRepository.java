package sample.dao;


import org.springframework.data.repository.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

interface DataRepository extends Repository<DataJPA, Long> {

    Page<DataJPA> findAll(Pageable pageable);

    DataJPA findById(int Id);

}
