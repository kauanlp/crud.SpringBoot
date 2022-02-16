package com.javaparainiciantes.boot.restapicrudexample;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data; 

// o Car vai ser uma "Entity" do JPA porque ele vai ser salvo no banco

@Entity
@Data
@AllArgsConstructor // construtor com todos os parametros

public class Car {
    Long id;
    String brand;
    String model;
    Integer year;
}
