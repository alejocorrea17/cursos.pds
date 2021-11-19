package com.example.clase211021.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "instructors")

public class Instructor extends EntityBase{

    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "instructor",cascade = CascadeType.PERSIST)
    private List<Course> courses;

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
