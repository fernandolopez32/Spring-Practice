package com.example.springpractice.models;

import javax.persistence.*;

@Entity
@Table(name = "national_parks")
public class NationalPark {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String name;


//    constructor

    public NationalPark() {
    }



//    setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
