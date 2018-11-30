package sample.dao;

import java.util.List;

    public class DataService {

        private static DataDAO dataDAO;

        public DataService() {
            dataDAO = new DataDAO();
        }

        public void persist(Data entity) {
            dataDAO.openCurrentSessionwithTransaction();
            dataDAO.persist(entity);
            dataDAO.closeCurrentSessionwithTransaction();
        }

        public void update(Data entity) {
            dataDAO.openCurrentSessionwithTransaction();
            dataDAO.update(entity);
            dataDAO.closeCurrentSessionwithTransaction();
        }

        public Data findById(String id) {
            dataDAO.openCurrentSession();
            Data data = dataDAO.findById(id);
            dataDAO.closeCurrentSession();
            return data;
        }

        public void delete(String id) {
            dataDAO.openCurrentSessionwithTransaction();
            Data data = dataDAO.findById(id);
            dataDAO.delete(data);
            dataDAO.closeCurrentSessionwithTransaction();
        }

        public static List<Data> findAll() {
            dataDAO = new DataDAO();
            dataDAO.openCurrentSession();
            List<Data> books = dataDAO.findAll();
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
        }
    }

