package br.edu.ifsp.ifspcodelab.gestaoestagiosbackend.department;

import br.edu.ifsp.ifspcodelab.gestaoestagiosbackend.campus.Campus;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    private UUID id;
    private String name;
    private String abbreviation;

    @ManyToOne
    private Campus campus;
    //private Campus campus;

    public Department(){}

    public Department(String name, String abbreviation, Campus campus) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.abbreviation = abbreviation;
        this.campus = campus;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
