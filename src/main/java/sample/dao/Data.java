package sample.dao;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
    @Table(name = "Full_info")
    public class Data implements Serializable {

        @Id
        @GeneratedValue
        @Column(name = "info_id", nullable = false)
        private int info_id;

        @Column(name = "name", nullable = false)
        private String name;

        @Column(name = "surname", nullable = false)
        private String surname;

        @Column(name = "patronymic", nullable = false)
        private String patronymic;

        public int getId() {
            return info_id;
        }

        public void setId(Long id) {this.info_id = info_id; }

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}

        public String getSurname() { return surname;}

        public void setSurname(String surname) {this.surname = surname;}

        public String getPatronymic() {return patronymic;}

        public void setPatronymic(String patronymic) {this.patronymic = patronymic;}

        @Override
        public String toString(){return getId() + "," +  getName() + ","
                + getSurname() + "," + getPatronymic();}
    }


