package org.example.mproject;

import jakarta.persistence.*;

@Entity
@Table(name = "Car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Changed from user_id to id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "engine")
    private String engine;

    @Column(name = "cc")
    private int cc;

    @Column(name = "power")
    private int power;

    // No-argument constructor
    public CarEntity() {
    }

    // Parameterized constructor
    public CarEntity(Long id, String name, String engine, int cc, int power) {
        this.id = id;
        this.name = name;
        this.engine = engine;
        this.cc = cc;
        this.power = power;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
