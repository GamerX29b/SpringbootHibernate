package sample.dao;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import sample.SampleWebJspApplication;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;


@SpringBootTest(classes = {DataJPA.class})
@EnableAutoConfiguration
//@ContextConfiguration(classes = TransportConfiguration.class)
@Configurable
public class DataJPATest2 {


    @Autowired
    private AdressRepository adressRepository;
    /*public DataJPATest2(DataInRepository dataInRepository) {

    }*/

    public DataJPATest2() {
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before test");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After test");
    }

    @Before
    public void initTestdataInRepository(){

    }
    @After
    public void Test() {
      //  dataJPA = null;

        adressRepository.deleteById(new Long(1));
    }
    @Test
    public void JPATest() throws Exception {
        DataAdress dataAdress = new DataAdress();
        dataAdress.setId_adress(1);
        dataAdress.setInfo_id(6);
        dataAdress.setAdress_Person("Omsk");


        DataAdress dataAdresTest = adressRepository.save(new DataAdress());
        //DataAdress foundJPA = adressRepository.findById(new Long(1));
        Optional<DataAdress> foundJPA = adressRepository.findById(new Long(1));

        assertNotNull(foundJPA);
        assertEquals(dataAdresTest.getAdress_Person(), foundJPA.get().getAdress_Person());


    }
    @Test(timeout = 500)
    public void timeStampTest() {
        while (true);
    }


}