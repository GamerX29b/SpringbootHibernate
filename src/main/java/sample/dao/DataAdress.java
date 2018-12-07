package sample.dao;

import javax.persistence.*;
import java.io.Serializable;

@Entity
    @Table(name = "adress")
    public class DataAdress implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_adress", nullable = false)
    private int id_adress;

    @Column(name = "info_id", nullable = false)
    private int info_id;

    @Column(name = "Adress_Person", nullable = false)
    private String adress_Person;

    public int getId_adress() {
        return id_adress;
    }

    public void setId_adress(int id_adress) {
        this.id_adress = id_adress;
    }

    public int getInfo_id() {
        return info_id;
    }

    public void setInfo_id(int info_id) {
        this.info_id = info_id;
    }

    public String getAdress_Person() {
        return adress_Person;
    }

    public void setAdress_Person(String adress_Person) {
        this.adress_Person = adress_Person;
    }
}
