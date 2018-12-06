package sample.dao;

import org.springframework.stereotype.Controller;

@Controller
    public class IndexController {




       /* private static DataDAO dataDAO;

        public IndexController() {
            dataDAO = new DataDAO();
        }

        public void persist(DataJPA entity) {
            dataDAO.openCurrentSessionwithTransaction();
            dataDAO.persist(entity);
            dataDAO.closeCurrentSessionwithTransaction();
        }

        public void update(DataJPA entity) {
            dataDAO.openCurrentSessionwithTransaction();
            dataDAO.update(entity);
            dataDAO.closeCurrentSessionwithTransaction();
        }

        public DataJPA findById(String id) {
            dataDAO.openCurrentSession();
            DataJPA data = dataDAO.findById(id);
            dataDAO.closeCurrentSession();
            return data;
        }

        public void delete(String id) {
            dataDAO.openCurrentSessionwithTransaction();
            DataJPA data = dataDAO.findById(id);
            dataDAO.delete(data);
            dataDAO.closeCurrentSessionwithTransaction();
        }

        public static List<DataJPA> findAll() {
            dataDAO = new DataDAO();
            dataDAO.openCurrentSession();
            List<DataJPA> books = dataDAO.findAll();
            dataDAO.closeCurrentSession();
            return books;
        }

        public void deleteAll() {
            dataDAO.openCurrentSessionwithTransaction();
            dataDAO.deleteAll();
            dataDAO.closeCurrentSessionwithTransaction();
        }

        public DataDAO bookDao() {
            return dataDAO;
        }*/
    }

