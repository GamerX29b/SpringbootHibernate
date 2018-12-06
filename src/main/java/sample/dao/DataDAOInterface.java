package sample.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface DataDAOInterface{


        //Page<DataJPA> ;
        DataJPA getData (Long Id);


    /*    public void update(T entity);

        public T findById(Id id);

        public void delete(T entity);

        public List<T> findAll();

        public void deleteAll();*/


}
