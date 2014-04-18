package model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigInteger;


/**
 * Created by luke on 4/15/14.
 */
@Entity
@Table(name = "cert")
public class Certificate {

    @Id
    @SequenceGenerator(name="my_seq", sequenceName="id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator="my_seq")
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }
}
