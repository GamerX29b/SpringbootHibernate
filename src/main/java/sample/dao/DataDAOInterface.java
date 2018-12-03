package sample.dao;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

public interface DataDAOInterface{


        //Page<Data> ;
        Data getName (String Id);
    /*    public void update(T entity);

        public T findById(Id id);

        public void delete(T entity);

        public List<T> findAll();

        public void deleteAll();*/


}
