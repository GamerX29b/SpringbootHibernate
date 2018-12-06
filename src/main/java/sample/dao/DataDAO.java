package sample.dao;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Component("dataDAOInterface")
@Transactional
class DataDAO implements DataDAOInterface {

    private final DataRepository dataRepository;

    DataDAO(DataRepository cityRepository){
        this.dataRepository = cityRepository;
    }


    @Override
    public DataJPA getData(Long Id) { //Геттер

        Assert.notNull(Id, "Id must not be null");
        return this.dataRepository.findById(Id);

    }


    /*
    private Session currentSession;

    private Transaction currentTransaction;

    public DataDAO() {
    }

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }



    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public void persist(DataJPA entity) {
        getCurrentSession().save(entity);
    }

    public void update(DataJPA entity) {
        getCurrentSession().update(entity);
    }

    public DataJPA findById(String id) {
        DataJPA book = (DataJPA) getCurrentSession().get(DataJPA.class, id);
        return book;
    }

    public void delete(DataJPA entity) {
        getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<DataJPA> findAll() {
        List<DataJPA> inf = (List<DataJPA>) getCurrentSession().createQuery("from DataJPA").list();
        return inf;
    }

    public void deleteAll() {
        List<DataJPA> entityList = findAll();
        for (DataJPA entity : entityList) {
            delete(entity);
        }
    }*/
}
