package sample.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
    @Table(name = "Full_info")
    public class DataJPA implements Serializable { //Подключение к базе

        @Id
        @GeneratedValue
        @Column(name = "info_id", nullable = false)
        private int id;

        @Column(name = "name", nullable = false)
        private String name;

        @Column(name = "surname", nullable = false)
        private String surname;

        @Column(name = "patronymic", nullable = false)
        private String patronymic;


        public DataJPA(Collection<DataAdress> DataAdress) {
            this.DataAdress = DataAdress;
        }

        public DataJPA() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {this.id = id; }

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}

        public String getSurname() { return surname;}

        public void setSurname(String surname) {this.surname = surname;}

        public String getPatronymic() {return patronymic;}

        public void setPatronymic(String patronymic) {this.patronymic = patronymic;}


        @Override
        public String toString(){return getId() + "," +  getName() + ","
                + getSurname() + "," + getPatronymic();}

        @OneToMany (fetch = FetchType.EAGER,  targetEntity = DataAdress.class)
        @JoinColumn(name = "INFO_ID", updatable = true, insertable = true)
        private Collection<DataAdress> DataAdress;
    }

